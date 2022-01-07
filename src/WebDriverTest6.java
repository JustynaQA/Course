public class WebDriverTest6 {
    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirexox = new FirefoxDriver();


        //klasa ANOMNIMOWA ma zachowania, ale nie ma nazwy, ma dokłądnie jedną instancję tzn. jeden obiekt
        //klasa ANOMNIMOWA nie ma swojej nazwy, tylko przyjmuje nazwę z interfejsu tzn. po słowie NEW podajemy nazwę interfejsu

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }
        };
        safari.findElementBy();
        safari.get();
    }
}
