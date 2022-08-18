package principlesOOP.printEdition;

public class Magazine extends PrintEdition {
    String type;

    public Magazine(String name, String type) {
        super(name);
        this.type = type;
    }
}
