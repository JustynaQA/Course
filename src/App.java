public class App {

    public String name;
    public String model;

    public App(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void appInfo() {
        System.out.println("Komunikat z klasy bazowej App " + name +" " + model);
    }
}
