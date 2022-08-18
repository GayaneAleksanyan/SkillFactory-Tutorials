package principlesOOP.transport;

public class Plane extends Transport {
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    public boolean canMove(int n) {
        if (fuel >= 0) {
            fuel -= n;
            return true;
        } else return false;
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    public void fillFuel(int n) {
        fuel += n;
    }
}
