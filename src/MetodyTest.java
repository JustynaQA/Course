public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();

        metody.policzWynik();
        metody.policzWynik();
        metody.policzWynik();

        MetodyTest obiekt = new MetodyTest();
        obiekt.example();


    }

    public void example() {
        double poleTrapezuPierwszego = obliczPoleTrapezu(8, 10, 5);
        System.out.println(poleTrapezuPierwszego);
        wypiszKoniec();
        wypiszTekst("test");
        boolean wększa = większaLiczba(120);

    }



    double obliczPoleTrapezu(double pierwszaPodstawa, double drugaPodstawa, double wysokość) {
        double poleTrapezu = ((pierwszaPodstawa + drugaPodstawa) * wysokość / 2);
        return poleTrapezu;
    }

    boolean większaLiczba(int liczba){
        return liczba >100;
    }

    void wypiszKoniec() {
        System.out.println("koniec testu");
    }
    void wypiszTekst(String tekst){
        System.out.println(tekst);
    }

}

