public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("korzystam z przeglądarki Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocą Chrome");
    }
}
