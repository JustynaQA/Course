//jak wymusić implementację metody z interfejsu > IMPLEMENTS + nazwa interfejsu
public class Bike implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("jadę z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuję i kończę jazdę");
    }


}
