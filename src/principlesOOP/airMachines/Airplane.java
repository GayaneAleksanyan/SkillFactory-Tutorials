package principlesOOP.airMachines;

public class Airplane extends Aeroplane {
    int power;

    public Airplane(int number, int speed, int wingspan, int power) {
        super(number, speed, wingspan);
        this.power = power;
    }
}