import static org.junit.jupiter.api.Assertions.*;

class Calculator3Tests {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator3 calculator3 = new Calculator3();
        int result = calculator3.add(1, 3);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void sub() {
    }

    @org.junit.jupiter.api.Test
    void multi() {
    }

    @org.junit.jupiter.api.Test
    void divi() {
    }
}