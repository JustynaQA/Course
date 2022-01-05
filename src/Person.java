public class Person {

    public String name;
    public int age;

    //konstruktor
    public Person(String name, int age) {
        System.out.println("jestem w konstruktorze person");
        this.name = name;
        this.age = age;
    }
// metoda
    public void eat() {
        System.out.println("I like pizza");
    }
// metoda
    public void walk() {
        System.out.println("I like walking");
    }


}
