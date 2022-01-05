package Animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("hou");
        sayHello();
        System.out.println(legs);
    }
}
