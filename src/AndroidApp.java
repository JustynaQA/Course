public class AndroidApp extends App {

    public AndroidApp(String name, String model) {
        super(name, model);
    }

    public void runAndroidApp() {
        System.out.println("komunikat z klasy potomnej AndroidApp " + name + " " + model);
    }


}
