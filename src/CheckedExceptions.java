import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) {
        //w bloku try definiujemy kod
        try {
            System.out.println("before reading file");
            readFile("C:\\Users\\porebskaj\\Course\\src\\test2.txt");
            System.out.println("after reading file");
            // gdy kod wyrzuci wyjątek łapiemy go w bloku catch
        } catch (FileNotFoundException e) {
            System.out.println("wyjątek został złapany");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //blok finally wykona się zawsze
        } finally {
            System.out.println("plik zostanie zamknięty");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
