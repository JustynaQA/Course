package Animals;

public abstract class Animal {

    public final static int legs = 4;

    //metoda abstrakcyjna, której implementację dostarczą klasy, które dziedziczą po klasie Animal
    public abstract void sound();

    public void sayHello() {
        System.out.println("I am an animal");
    }

}
