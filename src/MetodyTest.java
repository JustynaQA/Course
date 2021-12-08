public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//        int wynik = metody.pobierzWynik();
//        System.out.println(wynik);
//        int wynik2 = wynik*2;
//        System.out.println("wynik po mnożeniu to: " + wynik2);

        metody.policzWynikElastyczna(5);
        metody.policzWynikElastyczna(99);

        metody.add(2, 3, "Hello");
        int result = metody.add(2, 3, "Hello");

    }
}