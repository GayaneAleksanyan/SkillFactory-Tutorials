package streamIONIO.receipt;

import java.io.FileNotFoundException;

public class Client extends Receipt {
    public static void main(String[] args) throws FileNotFoundException {
        Client client = new Client();
        System.out.println(client.getReceipt());
    }
}
