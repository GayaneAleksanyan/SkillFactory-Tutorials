package libraries.file;

import java.io.File;

public class FileLength {
    public static void main(String[] args) {
        File folder = new File("C:\\tmp");
        long size = getFolderSize(folder);
        System.out.println((size / 1024 / 1024) + " MB");
    }

    private static long getFolderSize(File folder) {
        File[]files = folder.listFiles();
        long length = 0;
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                length += file.length();
            } else {
                length += getFolderSize(file);
            }
        }
        return length;
    }
}
