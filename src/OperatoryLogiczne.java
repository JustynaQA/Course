public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean forthValue = true;
        //&& to zapis i

        //&& > true wtedy gdy dwa wyrażenia składowe sa true
        System.out.println(firstValue   && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue && forthValue);
        System.out.println(secondValue && thirdValue);

        // || to lub > true wtedy gdy jedno wyrazenie skłądowe jest równe true
        System.out.println(firstValue || secondValue); //true
        System.out.println(secondValue || thirdValue);

        // ! to negacja - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!firstValue&&secondValue); // true

    }
}
