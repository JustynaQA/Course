public interface Vehicle {

    //nie napisaliśmy PUBLIC, ponieważ metody w interfejsach domyślnie są publiczne,
    // w interfejsach robimy puste metody, implementowane będą w klasie ( powstaje tylko ciało metody)
    void jazda(int speed);
    void stop();

    public String info();


}
