package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.delete()) {
            System.out.println("usunęliśmy plik");
        } else {
            System.out.println("nie udało się");
        }
    }
}
