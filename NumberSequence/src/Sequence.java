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
        System.out.println("Length!");
        lengthNumber = new InPutParameters().inPutParameters();
        return lengthNumber;
    }

    public int getMaxSquare() {
        System.out.println("Max M");
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
