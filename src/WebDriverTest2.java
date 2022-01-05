import java.util.Scanner;

public class WebDriverTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String driverName = scanner.nextLine();

//        ChromeDriver chrome = new ChromeDriver();
//        chrome.get();
//        chrome.findElementBy();
//
//        FirefoxDriver firefox = new FirefoxDriver();
//        firefox.get();
//        firefox.findElementBy();

        WebDriver driver = createWebDriver(driverName);
        driver.get();
        driver.findElementBy();

        FirefoxDriver firefoxDriver = createFirefoxDriver();

    }


    private static WebDriver createWebDriver(String name) {

        return createFirefoxDriver();

    }

    private static FirefoxDriver createFirefoxDriver() {

        return new FirefoxDriver();

    }
}
