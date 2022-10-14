package streamIONIO.inputOutput;

import java.io.InputStream;
import java.util.Scanner;

public class OneZeroStream extends InputStream {
    private byte[] bytes = {49, ' ', 48, ' '};
    int i = 0;

    @Override
    public int read() {
        if (i >= bytes.length)
            i = 0;
        return bytes[i++];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++) {
            System.out.print(scanner.nextInt());
        }
    }
}