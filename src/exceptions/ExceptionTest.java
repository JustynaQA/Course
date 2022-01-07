package exceptions;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 0) {
            throw new InvalidAgeException("invalid age value");
        } else if (age >= 18) {
            System.out.println("jesteś pełnoletni");
        } else {
            System.out.println("jesteś dzieckiem");
        }

    }
}
