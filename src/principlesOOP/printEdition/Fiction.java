package principlesOOP.printEdition;

public class Fiction extends Book {
    String genre;

    public Fiction(String name, int quantityOfPages, int year, String author, String[] pages, String genre) {
        super(name, quantityOfPages, year, author, pages);
        this.genre = genre;
    }
}
