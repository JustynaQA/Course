public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public static String nazwaUczelni = "AGH po zmianie";


    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void podajAdresEmail() {
        System.out.println("Podaj adres email " + email + nick);
    }

    public static void infoUczelnia() {
        //wewnątrz metody statycznej można korzystać tylko w pól i metod statycznych, dlatego imię i nazwisko nie działa ( potrzebują stworzenia obiektu danej klasy)
//        System.out.println(imie + nazwisko);
        System.out.println("moja uczelnia to: " + nazwaUczelni);
        drugaMetoda();
    }

    public static void drugaMetoda() {
        System.out.println("druga metoda");
    }
}
