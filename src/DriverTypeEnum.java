import javax.xml.xpath.XPath;

public enum DriverTypeEnum {
    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefox.exe");

    String name;
    String path;

    // konstruktor stworzony przez nas
    DriverTypeEnum(String name, String path) {
        this.name = name;
        this.path = path;
    }

    // konstruktor domyślny
    DriverTypeEnum() {

    }
}
