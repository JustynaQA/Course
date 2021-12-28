public class  KlasaStudent {

public String imie;
public String nazwisko;
public String nick;
public String email;
public int numerIndeksu;


    public void przedstawSie() {
    System.out.println("nazywam się " + imie + nazwisko);

}
    public void logowanie(){
        System.out.println("Loguję się za pomocą " + email);
}
    public void podajNrIndeksu(){
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Mój email to: " + email);
    }
}
