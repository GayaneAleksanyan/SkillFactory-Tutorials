package principlesOOP.airMachines;

public class Helicopter extends Aircraft {
    int screwDiameter, power;

    public Helicopter(int number, int speed, int screwDiameter, int power) {
        super(number, speed);
        this.screwDiameter = screwDiameter;
        this.power = power;
    }
}