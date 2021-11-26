public class InstrukcjeWarunkowe {
    /*public static void main(String[] args) {
        float a = 4.0F;
        float b = 0;
        if (b != 0) {
            System.out.println("wynik dzielenia to: " + (a / b));
        }
        else {
            System.out.println("Proszę podaj inną liczbę 'B' ");
        }
    }*/

    public static void main(String[] args) {
        int number = 12;
        if(number == 0) {
            System.out.println("Liczba równa zero");
        } else if (number >0 ) {
            System.out.println( "Liczba dodatnia, większa od 0");
        } else if (number >10){
            System.out.println( "Liczba większa od 10"); //jeżeli spełnione sa dwa warunki zostaje wypisany tylko pierwszy
        } else if (number < -5) {
            System.out.println("liczba mniejsza od -5");
        } else {
            System.out.println("żaden warunek nie został spełniony");
        }

    }
}





