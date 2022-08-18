package principlesOOP.supersab;

public class SubClass extends SuperClass {
    SubClass(int d) {
        super(d + 1);
    }

    public static void main(String[] args) {
        SubClass s = new SubClass(1);
        s.getD();
    }
}
