public class MatchTeacher extends Person {

    public String school;

    public MatchTeacher(String name, int age, String school) {
        //super wywołuje konstruktor klasy nadrzędnej
        super(name, age);
        System.out.println("jestem w konstruktorze MathTeacher");
        this.school = school;
    }

    public void techMatch() {
        eat();
        System.out.println("I am teaching math");
    }


    public void walk() {
        //wywołanie metody walk z klasy Person, słowa super umożliwia wywołanie pól i metod z klasy bazowej
        super.walk();
        System.out.println("I walk very fast");
    }

    public void sayHello() {
        System.out.println("hello my name is " + name);
        System.out.println("I am " + age);
    }

}
