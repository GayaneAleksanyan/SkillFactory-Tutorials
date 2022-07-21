package calculations;

public class UpTheStairs {
    public static void main(String[] args) {
        int kolya = 12;
        int petya = 8;
        kolya /= 2;
        kolya += petya;
        petya = kolya - 12;
        System.out.println("Петя живет на " + petya + " этаже.");
        System.out.println("Коля живет на " + kolya + " этаже.");
    }
}
