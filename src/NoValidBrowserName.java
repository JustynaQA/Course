import document.ExcelDocument;

public class NoValidBrowserName extends Exception {

    // mamy dwa rodzaje rozszerzeń: Exception i Runtime Exception. W Exception musimy dodać:  throws NoValidBrowserName, w RuntimeException nie jest to potrzebne
    public NoValidBrowserName(String message) {
        super(message);
    }
}
