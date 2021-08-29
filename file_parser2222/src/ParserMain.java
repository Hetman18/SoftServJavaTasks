import java.io.IOException;

public class ParserMain {
    public static void main(String[] args) throws IOException {
        InPutVariable inPut = new InPutVariable();
        System.out.println("Let's begin to work!");
        Parser parser1 = new Parser(inPut.fileLink(), inPut.matchEnter(), inPut.stringForChange());
        if (parser1.getChangeString().equals("0")) {
            parser1.outPutMatchText();
        } else {
            parser1.writingChanges();
//        Parser parser = new Parser(inPut.fileLink(), inPut.matchEnter());


        }
    }
}
