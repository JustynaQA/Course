public class WebDriverTest5 {
    public static void main(String[] args) throws NoValidBrowserName {


//        ChromeDriver chrome = new ChromeDriver();
//        chrome.findElementBy();
//        chrome.get();

        DriverTypeEnum[] driverTypes = DriverTypeEnum.values();

        for (int i = 0; i < driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver = getsDrivers(DriverTypeEnum.FIREFOX);
        driver.get();
        driver.findElementBy();

    }

    private static WebDriver getsDrivers(DriverTypeEnum type) throws NoValidBrowserName {
        if (type == DriverTypeEnum.CHROME) {
            return new ChromeDriver();
        } else if (type.name.equals("firefox")) {
            System.out.println(type.path);
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("Wrong browser name");
    }
}
