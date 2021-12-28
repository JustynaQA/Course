public class User {
    public String username;
    public String password;

//    public User(){
//        System.out.println("hello z konstruktora");
//    }

//    public void sayHello(){
//        System.out.println("hello z konstruktora");
//    }

public User(String username, String password){
    System.out.println("Hello od konstruktora");
    this.username = username;
    this.password = password;
//    username = user;
//    password = pass;
}



}
