public class SequenceProgram {



    public int sqrtFromMaxSquare() {
        double sqrtMaxSquare = Math.ceil(Math.sqrt(new Sequence().getMaxSquare()));
        return (int) sqrtMaxSquare;
    }

    public void outPutSequence() {
        for (Integer arr : new Sequence().getSequence()) {
            System.out.print(arr + " ");
        }
    }
}
