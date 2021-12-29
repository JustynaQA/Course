public class IphoneApp extends App {

    public IphoneApp(String name, String model) {
        super(name, model);
    }

    public void runIphoneApp() {
        System.out.println("komunikat z klasy potomnej IphoneApp " + name + " " + model);
    }


}
