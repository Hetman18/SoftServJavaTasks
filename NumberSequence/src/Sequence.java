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

    public int sqrtFromMaxSquare() {
        int sqrtMaxSquare = 0;
        sqrtMaxSquare = (int) Math.sqrt(new Sequence().getMaxSquare());
        return sqrtMaxSquare;
    }

    public List<Integer> sequence() {
//        Sequence sequence = new Sequence(sqrtFromMaxSquare(), getLengthNumber());
        int startSequence = sqrtFromMaxSquare();
        getLengthNumber();
        List<Integer> sequenceArray = new ArrayList<>();
        for (int i = 0; i < lengthNumber; i++) {
            sequenceArray.add(startSequence++);
        }
        return sequenceArray;
    }
//    public int createSequence() {
//        Sequence sequence = new Sequence(getMaxSquare(), getLengthNumber());
//        new SequenceProgram().sequence();
//    }

//        public void outPutSequence() {
//        sequence().toString();
//        }

    public void outPutSequence() {
        for (Integer arr : sequence()) {
            System.out.println(arr);
        }
    }
}
