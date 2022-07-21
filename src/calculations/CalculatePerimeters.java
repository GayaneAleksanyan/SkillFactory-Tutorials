package calculations;

public class CalculatePerimeters {
    public static void main(String[] args) {
        int sideLengthTriangle = 3;
        int sideLengthSquare = 4;
        int radius = 5;
        System.out.println("Perimeter triangle = " + PerimeterTriangle(sideLengthTriangle));
        System.out.println("Perimeter square = " + PerimeterSquare(sideLengthSquare));
        System.out.println("Perimeter circle = " + PerimeterCircle(radius));
    }

    public static int PerimeterTriangle(int length) {
        return 3 * length;
    }

    public static int PerimeterSquare(int length) {
        return 4 * length;
    }

    public static double PerimeterCircle(int radius) {
        double PI = 3.14159;
        return 2 * PI * radius;
    }
}
