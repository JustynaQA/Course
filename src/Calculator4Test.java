import java.util.Scanner;

public class Calculator4Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addResult = Calculator4.add(firstNumber, secondNumber);
        System.out.println("wynik dodawania to: " + addResult);

        int subResult = Calculator4.sub(firstNumber, secondNumber);
        System.out.println("Wynik odejmowania to: " + subResult);
    }
}
