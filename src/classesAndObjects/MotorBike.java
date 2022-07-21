package classesAndObjects;

public class MotorBike {
    private String model;
    private int year;
    private String color;

    public MotorBike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
class Task2 {
    public static void main(String[] args) {
        MotorBike motorbike = new MotorBike(2020, "Honda", "Black");
        System.out.println(motorbike.getModel() + "\n" +
                motorbike.getYear() + "\n" +
                motorbike.getColor());
    }
}
