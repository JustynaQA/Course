//zwracają wartośc true / false

import java.util.Scanner;

public class OperatoryPorownania {
   /* public static void main(String[] args) {
    int firstNumber = 4;
    int secondNumber = 6;
    boolean result = secondNumber > firstNumber;
        System.out.println(result);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
    }*/
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Podaj pierwszą liczbę: ");
       int firstNumber = scan.nextInt();
       System.out.println("Podaj drugą liczbę ");
       int secondNumber = scan.nextInt();
       System.out.println(firstNumber > secondNumber);
       System.out.println(firstNumber <= secondNumber);
       System.out.println(firstNumber == secondNumber);
       System.out.println(firstNumber != secondNumber);
   }
}
