package principlesOOP.airMachines;

public class Aircraft {
    int number, speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double flight(int n) {
        return n / speed;
    }
}