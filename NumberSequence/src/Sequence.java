import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private int maxSquare;
    private int lengthNumber;

    public Sequence(int maxSquare, int lengthNumber) {
        this.maxSquare = maxSquare;
        this.lengthNumber = lengthNumber;
    }

    public Sequence() {
    }

    public int getLengthNumber() {
        lengthNumber = new InPutParameters().inPutParameters();
        return lengthNumber;
    }

    public int getMaxSquare() {
        maxSquare = new InPutParameters().inPutParameters();
        return maxSquare;
    }

    public List<Integer> sequence() {
//        Sequence sequence = new Sequence(sqrtFromMaxSquare(), getLengthNumber());
        int startSequence = new SequenceProgram().sqrtFromMaxSquare();
        getLengthNumber();
        List<Integer> sequenceArray = new ArrayList<>();
        for (int i = 0; i < lengthNumber; i++) {
            sequenceArray.add(startSequence++);
        }
        return sequenceArray;
    }
}
