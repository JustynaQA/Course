package document;

public class DocumentChecker {

    public static void main(String[] args) {
//        ExcelDocument document = new ExcelDocument();
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();
        //klasa bazowa ma typ klasy potomnej

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
