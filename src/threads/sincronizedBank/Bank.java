package threads.sincronizedBank;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
    private AtomicInteger money = new AtomicInteger();
    private Object lock = new Object();

    public int getMoney() {
        return money.get();
    }

    public void take(int money) {
            this.money.addAndGet(-money);
    }

    public void repay(int money) {
            this.money.addAndGet(money);
    }

    public class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                if (getMoney() >= 1000) {
                    take(1000);
                    repay(1000);
                }
            }
        }
    }

    public Bank() {
        money.set(10000);
        for (int i = 0; i < 5; i++) {
            new Client().start();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while (true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
