public class Calculator4 {
    public static int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int sub(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int multi(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int divi(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            throw new RuntimeException("wprowadzono nieprawidłową liczbę");

        } else {
            int result = firstNumber / secondNumber;
            return result;
        }
    }



}
