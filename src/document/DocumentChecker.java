package document;

import javax.print.Doc;

public class DocumentChecker {

    public static void main(String[] args) {
        // polimorfizm umożliwia deklarację nowego obiektu na dwa różne sposoby
       Document excel1 = new ExcelDocument();
       Document pdf1 = new PdfDocument();

        printDescription(excel1);
        printDescription(pdf1);
    }

    public static void printDescription(Document document) {

        document.getDescription();
    }
}
