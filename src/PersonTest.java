public class PersonTest {

    public static void main(String[] args) {

        MatchTeacher teacher = new MatchTeacher("tom", 30, "SP");
//        teacher.name = "Tom";
//        teacher.age = 30;
//        teacher.school = "SP";
        teacher.eat();
        teacher.walk();
        teacher.sayHello();
        teacher.techMatch();


        Footballer footballer = new Footballer("Alex", 25, "PSG");
        footballer.eat();
        footballer.walk();
//        footballer.name = "Alex";
//        footballer.age = 25;
//        footballer.club = "PSG";
        footballer.playFootbal();


    }
}
