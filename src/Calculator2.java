public class Calculator2 {

    int a = 1;
    int b = 2;

    public void dodawanie() {
        Calculator calculator = new Calculator();
        System.out.println("wynik dodawania to: " + (calculator.add(a, b)));

    }

    public void odejmowanie() {
        Calculator calculator = new Calculator();
        System.out.println("wynik odejmowanie to: " + (calculator.sub(a, b)));
    }

    public void mnożenie() {
        Calculator calculator = new Calculator();
        int mul = calculator.mul(a, b);
        System.out.println("Wynik mnożenia to: " + mul);
    }

    public void dzielenie() {
        Calculator calculator = new Calculator();
        System.out.println("wynik dzielenia to: " + (calculator.div(a, b)));
    }

}
