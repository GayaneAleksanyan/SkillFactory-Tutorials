package bookStore;

import java.util.Arrays;

public class BookStore {
    public static void main(String[] args) {
        Book[] allBooks = new Book[100];

        Book book1 = new Book();
        book1.name = "Book1";
        book1.price = 1000;
        book1.date = 1990;

        addBook(allBooks, book1);

        Book book2 = new Book();
        book2.name = "Book2";
        book2.price = 2000;
        book2.date = 2009;

        addBook(allBooks, book2);
        printAllBookList(allBooks);
    }

    public static boolean checkBook(Book[] allBooks, Book book) {
        for (Book item : allBooks) {
            if (item != null && item.name.equals(book.name) && item.date == book.date) {
                System.out.println("Book is already listed");
                return true;
            }
        }
        System.out.println("Book isn't listed");
        return false;
    }

    public static void addBook(Book[] allBooks, Book book) {
        if (!checkBook(allBooks, book)) {
            for (int i = 0; i < allBooks.length; i++) {
                if (allBooks[i] == null) {
                    allBooks[i] = book;
                    System.out.println("Book added to list");
                    break;
                }
                if (i == allBooks.length - 1) {
                    System.out.println("List is full");
                }
            }
        }
    }

    public static void printAllBookList(Book[] allBooks) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i + 1, allBooks[i].name, allBooks[i].date, allBooks[i].price);
            }
        }

    }
}
