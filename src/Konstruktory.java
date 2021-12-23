

public class Konstruktory {

    public String userName;
    public String password;

    public Konstruktory(){

    } // konstruktor bez podanych paramentrów jest domyślny

    //konstruktor z podanymi paramentrami
    public Konstruktory(String user, String pass){
        System.out.println("Hello od konstruktora");
    }

    public void sayHello(){
        System.out.println("Hello, my name is: " + userName);
    };

}
