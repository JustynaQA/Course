public class Footballer extends Person {

    public String club;

    public Footballer(String name, int age, String club) {
        super(name, age);
        System.out.println("jestem w konstruktorze footballer");
        this.club = club;
    }

    public void eat(){
        System.out.println("I like healthy food");
    }

    public void playFootbal() {
        System.out.println("i am playing footbal" + name + age + club);
    }


}
