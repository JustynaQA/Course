//jak wymusić implementację metody z interfejsu > IMPLEMENTS + nazwa interfejsu + alt + enter
public class Bike implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("jadę z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuję i kończę jazdę");
    }

    @Override
    public String info() {
        return "bike";
    }

    public void jedzenie() {
        System.out.println("aby mieć siłę do jazdy muszę dużo jeść");
    }
}
