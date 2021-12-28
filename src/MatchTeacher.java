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

    public void sayHello() {
        System.out.println("hello my name is " + name);
        System.out.println("I am " + age);
    }

}
