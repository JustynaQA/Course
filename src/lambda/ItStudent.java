package lambda;

public class ItStudent implements Student {
    @Override
    public void sayHello(String name) {
        System.out.println("I am studying IT, " + name);
    }
}
