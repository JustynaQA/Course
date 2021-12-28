import java.util.Scanner;

public class StudentChecker {

    public static void main(String[] args) {
        //pole statyczne, nie jest unikalne dla obiektu, jest wspóldzielone przez wszystkie obiekty klasy
        String uczelnia = Student.nazwaUczelni;
        // metoda statyczna działa  tak samo jak pole statyczne
        Student.infoUczelnia();

        Student uek = new Student();
        uek.imie = "uekimie ";
        uek.nazwisko = "ueknazwisko";
        uek.email = "uek@gmail.com, ";
        uek.nick = "uek";
//        uek.infoUczelnia();

        Student agh = new Student();
        agh.imie = "aghimie ";
        agh.nazwisko = "aghnaziwsko";
        agh.email = "agh@gmail.com, ";
        agh.nick = "agh";

        Student uj = new Student();
        uj.imie = "ujimie ";
        uj.nazwisko = "ujnazwisko";
        uj.email = "uj@gmail.com, ";
        uj.nick = "uj";

        Student[] studenci = new Student[3];
        studenci[0] = uek;
        studenci[1] = agh;
        studenci[2] = uj;

        for (int i = 0; i < studenci.length; i++) {
            studenci[i].przedstawSie();
            studenci[i].podajAdresEmail();
        }
        String imie = "kasia";
        Scanner scanner = new Scanner(System.in);


    }
}
