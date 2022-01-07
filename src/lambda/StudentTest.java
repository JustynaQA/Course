package lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it);

        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I am studying medicine, " + name);
            }
        };
        sayHello("Kate", med);
        //lambda > (parametr) ->

        Student noStudent = (name) -> System.out.println("I am not a student, " + name);
        sayHello("Tom", noStudent);


    }

    public static void sayHello(String name, Student student) {

        student.sayHello(name);


    }
}
