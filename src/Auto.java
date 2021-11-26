public class Auto {

    //definiujemy pola klasy
    public String marka;
    public String model;
    public int rok;
    public  int przebieg;

    //definiujemy metody
    public void jedz(){
        System.out.println("Jadę");
    }

    public void  hamuj (){
        System.out.println("Hamuję");
    }

    public void info(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Rok: " + rok);
    }
// obiekty są potrzebne do wywowałnia klas

}
