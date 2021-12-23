public class Metody {
// metody zawierają instrukcje, mogą być wywoływane / uruchamiane przez odwołanie się do jej nazwy

    public void policzWynik() {
        //definiujemy instrukcje dla metody
        System.out.println("Oblicz wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;

        }
        System.out.println(result);
    }

    public int pobierzWynik() {
        System.out.println("pobierz wynik");
        int result2 = 0;
        for (int i = 0; i < 100; i++) {
            result2 = result2 + i;
        }
        return result2;

    }
}

