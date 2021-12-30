package docs;

public class DocumentChecker {
    public static void main(String[] args) {

        Document pdfdoc = new PdfDocument();
        Document exceldoc = new ExcelDocument();

        pdfdoc.detDescription();
        exceldoc.detDescription();



    }
}
