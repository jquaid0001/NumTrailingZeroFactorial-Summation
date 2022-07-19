import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumZerosFactorialTest {

    @Test
    void zeros() {
        assertEquals(0, NumZerosFactorial.zeros(0));
        assertEquals(1, NumZerosFactorial.zeros(6));
        assertEquals(2, NumZerosFactorial.zeros(14));
        assertEquals(2, NumZerosFactorial.zeros(12));
        assertEquals(6, NumZerosFactorial.zeros(25));
        assertEquals(28, NumZerosFactorial.zeros(121));
        assertEquals(0, NumZerosFactorial.zeros(3));
        assertEquals(1, NumZerosFactorial.zeros(5));
        assertEquals(3, NumZerosFactorial.zeros(18));
        assertEquals(9, NumZerosFactorial.zeros(43));
        assertEquals(1270, NumZerosFactorial.zeros(5090));
        assertEquals(3, NumZerosFactorial.zeros(18));
    }
}