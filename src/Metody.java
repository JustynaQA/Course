public class Metody {

    public void policzWynik() {

        //definiujemy instrukcje dla metody, która NIC NIE ZWRACA
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println(result);
    }

    //definiujemy metodę, która coś zwraca > trzeba napisać RETURN!
    public int pobierzWynik() {
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println(result);
        return result;
    }

    public void policzWynikElastyczna(int number) {
        System.out.println("Number: " + number);
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println(result);
    }

    public int add(int firstNumber, int secondNumber, String word) {
        System.out.println("suma to: " + (firstNumber + secondNumber));
//        if(firstNumber==0) {
//        return 0;
//        }
        return (firstNumber+secondNumber);

    }
}

