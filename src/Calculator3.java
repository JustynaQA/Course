public class Calculator3 {

    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;

    }

    public int sub(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public int multi(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public int divi(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            throw new RuntimeException("wprowadzono nieprawidłową liczbę");

        } else {
            int result = firstNumber / secondNumber;
            return result;
        }
    }

}
