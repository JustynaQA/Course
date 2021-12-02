/*public class CustomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swoje imię");
        String name = scanner.nextLine();
        System.out.println("cześć " + name + " !");

    }
}*/

import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("My name is " + name);

        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        System.out.println("My name is " + name + " " + surname);

    }

}



