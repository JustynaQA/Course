public class Track implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("jadę "+ speed);
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public String info() {
        return "ciężarówka";
    }


}