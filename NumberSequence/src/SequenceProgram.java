public class SequenceProgram {

    public int sqrtFromMaxSquare() {
        double sqrtMaxSquare = Math.ceil(Math.sqrt(new Sequence().getMaxSquare()));
//        int maxSquare = Math.ceil(sqrtMaxSquare);
        return (int) sqrtMaxSquare;
    }

    public void outPutSequence() {
        for (Integer arr : new Sequence().sequence()) {
            System.out.print(arr + " ");
        }
    }
}
