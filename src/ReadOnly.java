public class ReadOnly {
    private String name = "Justyna";

    // getery metoda umożliwiająca pobranie wartości z pół prywatnych
    public String getName() {
        return name = name + "jest testerem";
//        return name;

    }

    // settery - metoda umożliwiająca ustawienie wartości pola prywatnego, dzięki temu pole może być konfigurowane z zewnątrz przez inne klasy

    public void setName(String name) {
        this.name = name;
    }

    // alt + insert umożliwia zrobienie getera i settera


}
