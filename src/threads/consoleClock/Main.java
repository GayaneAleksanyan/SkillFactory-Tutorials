package threads.consoleClock;

public class Main {
    public static void main(String[] args) {
        ConsoleClock cc = new ConsoleClock();
        cc.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cc.interrupt();
    }
}
