import java.util.Scanner;

public class WebDriverTest3 {
    public static void main(String[] args) {


//        ChromeDriver chrome = new ChromeDriver();
//        chrome.get();
//        chrome.findElementBy();
//        FirefoxDriver firefox = new FirefoxDriver();
//        firefox.get();
//        firefox.findElementBy();

        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();

        Scanner scanner = createScanner();
        Scanner scanner1 = createScanner();
        Scanner scanner2 = createScanner();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            ChromeDriver chromeDriver = new ChromeDriver();
            return chromeDriver;
        } else if (name.equals("firefox")) {
            FirefoxDriver firefoxDriver = new FirefoxDriver();
            return firefoxDriver;
        } else {
            throw new RuntimeException();
        }
    }

    private static Scanner createScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

}
