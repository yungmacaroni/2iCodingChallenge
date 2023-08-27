import org.example.NumberPairs;
import org.junit.*;
import static org.junit.Assert.assertEquals;

/*
* Test class for NumberPairs class
* Created by Massimo Demarco
* 27/08/2023
* */

public class NumberPairsTest {
    @Test
    public void test(){
        assertEquals(0, NumberPairs.sumToInt(new int[] {3, 4, 5, 6}, 1));
        assertEquals(1, NumberPairs.sumToInt(new int[] {0, 15, 32, 2000, 15000}, 15));
        assertEquals(2, NumberPairs.sumToInt(new int[] {1, 1, 10, 32, 41}, 42));
        assertEquals(3, NumberPairs.sumToInt(new int[] {1, 1, 10, 32, 41, 25, 17, 32}, 42));
    }
}
