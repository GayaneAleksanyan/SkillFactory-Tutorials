package streamIONIO.receipt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Receipt {
    public String getReceipt() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\galex\\Documents\\SkillFactory\\Loader\\src\\streamIO\\receipt\\receipt.txt"));
        double result = 0;

        while (scanner.hasNextLine()) {
            String[] productInfo = scanner.nextLine().split(";");
            result += Integer.parseInt(productInfo[1]) * Double.parseDouble(productInfo[2]);
        }

        return String.format(Locale.US, "%.2f", result);
    }
}

