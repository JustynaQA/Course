public class Conversion {
    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b;
        int d = a/(int)b;
        // przed zmienną, którą konwertujemy dodajemy w nawiasach nazwę typu
        System.out.println(d);
        System.out.println(c);


       WebDriver driver = new FirefoxDriver();
       FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
       firefoxDriver.get();


    }
}
