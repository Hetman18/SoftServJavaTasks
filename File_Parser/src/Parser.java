import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parser {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String inPutArguments;

    public String getInPutArguments() throws IOException {
        System.out.println("Enter new line: ");
        inPutArguments = reader.readLine();
        return inPutArguments;
    }

    public void chooseProgram() throws IOException {
        System.out.println("Enter 1 if you want to count entering in string, " +
                "2 if you want to change string on text or another to exit: ");
        String chose = reader.readLine();
        switch (chose) {
            case "1": {
                new Program().matchText();
                chooseProgram();
            }
            case "2": {
                new OutPutArguments().outPut();
                chooseProgram();
            }
            default: {
                System.exit(0);
                break;
            }
        }
    }
}

