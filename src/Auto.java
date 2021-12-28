public class Auto {

    //definiujemy pola klasy
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    //konstruktor z podanymi paramentrami, tworzymy między polami, a metodami
    public Auto(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }

    //definiujemy metody
    public void jedz() {

        System.out.println("Jadę");
    }

    public void hamuj() {

        System.out.println("Hamuję");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Rok: " + rok);
    }
// obiekty są potrzebne do wywowałnia klas

}
