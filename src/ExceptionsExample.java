public class ExceptionsExample {
    public static void main(String[] args) {

//        int[] number = new int[2];
//
//        number[0] = 1;
//        number[1] = 3;
//
//        for (int i = 0; i <= number.length; i++) {
//            System.out.println(number[i]);
//        }

        WebDriver driver = getsDrivers("chrome");
        driver.get();
        driver.findElementBy();

    }

    private static WebDriver getsDrivers (String name){
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}

