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
/*    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);*/

    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Wynik dodawania to: " + firstNumber + secondNumber);
        System.out.println("Wynik odejmowania to: " + (firstNumber - secondNumber));
        System.out.println("Wynik mnożenia to: " + firstNumber*secondNumber);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.println("Jakie działanie chcesz wykonać?");
        String dzialanie = scanner.next();
        System.out.println("Wybrane działanie: " + dzialanie);
        System.out.println("Podaj drugą liczbę ");
        int secondNumber = scanner.nextInt();
        System.out.println("Wybrane działanie: " + (firstNumber*secondNumber));





    }


}
