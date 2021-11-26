public class InstrukcjaSwitch {
// alternatywa dla else if, pokazuje czytelnie jakie mamy opcje do wyboru
    public static void main(String[] args) {

        String danie = "frytki";

       switch (danie) {
           case "pizza":
               System.out.println("Cena to 22zł");
               break;
           case "łosoś":
               System.out.println("cena to 30zł");
               break;
           case "frytki":
               System.out.println("cena to 9zł");

           default:
               System.out.println("Brak dania w karcie");
       }
    }
}
