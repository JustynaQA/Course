public class FinalTest {
    public static void main(String[] args) {
        // zmienna final ma stałą wartość, której nie można nadpisać
        final int x = 2;
//        x = 3;

        // istniejący obiekt final możemy edytować tzn: imię i wiek, ale nie możemy zrobić drugiego takiego samego obiektu
        final Person person = new Person("Tim", 25);
        person.age = 26;
//        person = new Person("Max", 30);

// przy dziedziczeniu również nie możemy nadpisać metody oznaczonej jako FINAL
// jeżeli klasa została oznaczona jako FINAL nie można z niej dziedziczyć



    }
}
