import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SequenceProgramTest {

    @Test
    void positiveTestSqrtFromMaxSquareWithM_25_expect_5() {
        int sqrt = 25;
        double sqrtMaxSquare = Math.ceil(Math.sqrt(sqrt));
        assertEquals(5, sqrtMaxSquare);
    }

    @Test
    void negativeTestSqrtFromMaxSquareWithM_25_expect_5() {
        int sqrt = 36;
        double sqrtMaxSquare = Math.ceil(Math.sqrt(sqrt));
        assertNotEquals(36, sqrtMaxSquare);
    }
    @Test
    public void positiveTestSequenceWithStartSequence5_GetLengthNumber_5() {
        List<Integer> testArr = new ArrayList<>();
        testArr.add(5);
        testArr.add(6);
        testArr.add(7);
        testArr.add(8);
        testArr.add(9);
        int startSequence = 5;
        int getLengthNumber = 5;
        List<Integer> sequenceArray = new ArrayList<>();
        for (int i = 0; i < getLengthNumber; i++) {
            sequenceArray.add(startSequence++);
        }
        assertArrayEquals(sequenceArray.toArray(), testArr.toArray());
    }
}