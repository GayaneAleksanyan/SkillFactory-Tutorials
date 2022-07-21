package classesAndObjects;

public class Tank {
    static final String MODEL = "T34";
    static int count;

    private int x;
    private int y;
    private int dir;
    private int fuel = 100;
    private int number;


    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        number = ++count;
    }

    public void goForward(int i) {
        if (fuel < i) {
            i = fuel;
        }
        fuel -= i;

        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

//        if (i < 0 && -i > -fuel)
//            i = -fuel;
//        else if (i > fuel)
//            i = fuel;
//        if (dir == 0) x += i;
//        else if (dir == 1) y += i;
//        else if (dir == 2) x -= i;
//        else y -= i;
//        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + number + " is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        if (i >= 0) {
            if (fuel < i) {
                i = fuel;
            }
            fuel -= i;
        } else {
            if (fuel < Math.abs(i)) {
                i = fuel;
            }
            fuel -= i;
            i *= -1;

        }

        if (dir == 0) x -= i;
        else if (dir == 1) y -= i;
        else if (dir == 2) x += i;
        else y += i;

//        goForward(-i);
    }

}

class TankMain {

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();

        System.out.println();

        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}

