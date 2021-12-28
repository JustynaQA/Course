public class UserTest {
    public static void main(String[] args) {
        User user = new User("Justyna", "tajne");


        user.password = "tajne";
        user.username = "justyna";
        System.out.println(user.username);
        System.out.println(user.password);

    }
}
