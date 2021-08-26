import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseParserInterface {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void chooseParserWay() throws IOException {
        System.out.println("Enter 1 if you want to count entering in string, " +
                "2 if you want to change string on text or another to exit: ");
        String chose = reader.readLine();
        switch (chose) {
            case "1": {
                new Parser().matchText(new Program(), new InPutArguments());
                chooseParserWay();
                break;
            }
            case "2": {
                new OutPutArguments().outPut();
                chooseParserWay();
                break;
            }
            default: {
                break;
            }
        }
    }

}
