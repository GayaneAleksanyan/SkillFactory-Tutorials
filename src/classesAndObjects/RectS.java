package classesAndObjects;

public class RectS {
    private int s;
    int w, h;

    RectS(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}

class RectMain {
    public static void main(String[] args) {
        RectS rect = new RectS(20, 30);
        rect.w = 1;
        System.out.println(rect.getS());
        System.out.println(rect.getH() * rect.getW() == rect.getS());
    }
}
