import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pierwsza liczba");
        int firstNumber = scanner.nextInt();
        System.out.println("druga liczba");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();
        int addResult = calculator.add(firstNumber, secondNumber);
        System.out.println("wynik dodawania to: " + addResult);

        int subResult = calculator.sub(firstNumber, secondNumber);
        System.out.println("wynik odejmowania to: " + subResult);

        int mulResult = calculator.mul(firstNumber, secondNumber);
        System.out.println("Wynik mnożenia to: " + mulResult);

        int divResult = calculator.div(firstNumber, secondNumber);
        System.out.println("wynik dzielenia to: " + divResult);

        Calculator2 calculator2 = new Calculator2();
        calculator2.a = firstNumber;
        calculator2.b = secondNumber;
        calculator2.dodawanie();
        calculator2.odejmowanie();
        calculator2.mnożenie();
        calculator2.dzielenie();




    }

}
