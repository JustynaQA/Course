import java.util.Scanner;

public class Calculator3Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator3 calculator3 = new Calculator3();

        int addResult = calculator3.add(firstNumber,secondNumber);
        System.out.println("wynik dodawania to: " + addResult);

        int subResult = calculator3.sub(firstNumber,secondNumber);
        System.out.println("Wynik odejmowania to: " + subResult);













    }
}
