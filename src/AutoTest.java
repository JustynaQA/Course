public class AutoTest {

    public static void main(String[] args) {
//deklarujemy zmienną typu Auto
// po = tworzymy obiekt klasy auto
// Auto jest napisane z dużej litery, poniewaz jest to typ obiektowy


        Auto mercedes = new Auto();
        // przypisujemy wartości do pól naszego obiektu
        mercedes.marka = "Mercedes GLA";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1050;

        mercedes.info();
        mercedes.jedz();
        mercedes.hamuj();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "Q3";
        audi.rok = 2022;
        audi.przebieg = 0;

        audi.info();
        audi.hamuj();
        audi.jedz();

        Auto noName = new Auto();
        noName.info();
        noName.jedz();
        noName.hamuj();
    }
}
