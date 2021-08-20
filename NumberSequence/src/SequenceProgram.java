public class SequenceProgram {

    public int sqrtFromMaxSquare() {
        int sqrtMaxSquare = 0;
        sqrtMaxSquare = (int) Math.sqrt(new Sequence().getMaxSquare());
        return sqrtMaxSquare;
    }

    public void outPutSequence() {
        for (Integer arr : new Sequence().sequence()) {
            System.out.print(arr + " ");
        }
    }
}
