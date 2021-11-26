//Operatory matematyczne

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int miltiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int modulo = firstNumber%secondNumber;

        System.out.println("wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("dzielenie " + division);

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber;
        System.out.println(firstNumber+=secondNumber);

    }

}
