import static java.sql.DriverManager.getDriver;

public class WebDriverTest4 {
    public static void main(String[] args) {

        WebDriver driver = getDrive("firefox");
        driver.findElementBy();
        driver.get();

    }

    private static WebDriver getDrive(String name) {
        if (name.equals("chrome")) {
            ChromeDriver chromeDriver = new ChromeDriver();
            return new ChromeDriver();

        } else if (name.equals("firefox")) {
            FirefoxDriver firefoxDriver = new FirefoxDriver();
            return firefoxDriver;
        }
        return null;
    }
}
