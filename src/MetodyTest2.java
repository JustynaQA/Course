public class MetodyTest2 {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();

        int wynik = metody.pobierzWynik();
        int wynik2 = wynik * 2;
        System.out.println(wynik2);

    }

}
