package classesAndObjects;

public class AirPlane {
    private int x, y, z;
    private int fuel;
    private int countBombs;
    private int dir = 0;

    public AirPlane() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }

    public AirPlane(int x, int y, int z, int countBombs, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.countBombs = countBombs;
        this.fuel = fuel;
    }

    public void flyStraight(int i) {
        switch (dir) {
            case 0 -> this.x += i;
            case 1 -> this.y -= i;
            case 2 -> this.x -= i;
            case 3 -> this.y += i;
            default -> System.out.println("Something went wrong.");
        }
        this.fuel--;
        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("Out of fuel. Game over.");
        } else {
            System.out.println("Flying straight, your coordinates are: x=" + this.x + ", y=" + this.y + ", z=" + this.z + ". Remaining fuel=" + this.fuel + ".");
        }

    }

    private void flyStraightNonForPlayer(int i) {
        switch (dir) {
            case 0 -> this.x += i;
            case 1 -> this.y -= i;
            case 2 -> this.x -= i;
            case 3 -> this.y += i;
            default -> System.out.println("Something went wrong.");
        }
        fuel--;
    }

    public void flyUp(int up, int i) {
        flyStraightNonForPlayer(i);
        this.z += up;

        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("Out of fuel. Game over.");
        } else {
            System.out.println("Flying up, your coordinates are: x=" + this.x + ", y=" + this.y + ", z=" + this.z + ". Remaining fuel=" + this.fuel + ".");
        }
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
        System.out.println("You turned right.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
        System.out.println("You turned left.");
    }

    public void dropBombs() {
        if (countBombs > 0) {
            countBombs--;
            System.out.println("The plane dropped bomb at coordinates x=" + this.x + ", y=" + this.y + ". Remaining amount of bombs=" + this.countBombs + ".");
        } else {
            System.out.println("Out of bombs.");
        }
    }

    public void flyDown(int down, int i) {
        flyStraightNonForPlayer(i);
        this.z -= down;

        if (this.z <= 0) {
            this.z = 0;
            System.out.println("The plane landed.");
        } else {
            System.out.println("Flying down, your coordinates are: x=" + this.x + ", y=" + this.y + ", z=" + this.z + ". Remaining fuel=" + this.fuel + ".");
        }

    }

    public void fillFuel() {
        if (this.z > 0) {
            System.out.println("Fuel filling not possible.");
        } else {
            this.fuel += 100;
            if (this.fuel > 100) {
                this.fuel = 100;
            }
            System.out.println("Fuel refilled. Fuel now=" + this.fuel + ".");
        }
    }
}

class AirPlaneMain {
    public static void main(String[] args) {
        AirPlane plane = new AirPlane();
        plane.flyStraight(50);
        plane.flyUp(80, 90);
        plane.turnRight();
        plane.flyStraight(30);
        plane.dropBombs();
        plane.flyStraight(40);
        plane.flyDown(100, 10);
        plane.fillFuel();
        plane.flyDown(100, 10);
        plane.fillFuel();
    }
}
