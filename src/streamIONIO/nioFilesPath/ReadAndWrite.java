package streamIONIO.nioFilesPath;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\tmp\\ReadHere.txt");
            List<String> contents = Files.readAllLines(path);

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("C:\\tmp\\WriteHere.txt"))) {
            for (int index = contents.size() - 1; index >= 0; index--) {
                bufferedWriter.write(contents.get(index));
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
