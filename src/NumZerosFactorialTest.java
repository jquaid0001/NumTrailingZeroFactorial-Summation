import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumZerosFactorialTest {

    @Test
    void zeros() throws Exception {
        assertEquals(NumZerosFactorial.zeros(0), 0);
        assertEquals(NumZerosFactorial.zeros(6), 1);
        assertEquals(NumZerosFactorial.zeros(14), 2);
        assertEquals(NumZerosFactorial.zeros(12), 2);
        assertEquals(NumZerosFactorial.zeros(6), 1);

    }
}