public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chrome = new ChromeDriver();
        FirefoxDriver firefox = new FirefoxDriver();

        chrome.get();
        chrome.findElementBy();
        firefox.get();
        firefox.findElementBy();
    }
}
