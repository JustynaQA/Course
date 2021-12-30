public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("korzystam z przeglądarki Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocą Firefox");
    }
}
