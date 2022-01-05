public class WebDriverTest {
    public static void main(String[] args) {
//        ChromeDriver chrome = new ChromeDriver();
//        FirefoxDriver firefox = new FirefoxDriver();
//        chrome.get();
//        chrome.findElementBy();
//        firefox.get();
//        firefox.findElementBy();

//        WebDriver driver = null;
//        String name = null;
//        if (name.equals("chrome")) {
//            driver = new ChromeDriver();
//        } else if (name.equals("firefox")) {
//            driver = new FirefoxDriver();
//        }

        WebDriver driver = getDriver("firefox");

//        WebDriver chrome = getDriver("chrome");

        driver.get();
        driver.findElementBy();
        driver.findElementBy();

        String buba = getBuba("sdfsfsdf");

//        FirefoxDriver firefox = new FirefoxDriver();
//        firefox.get();
//        firefox.findElementBy();
    }


    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
//        throw new NoValidBrowserName();
    }

    public static String getBuba(String input) {
        return new String(input + "sdfsdf");

    }
}





