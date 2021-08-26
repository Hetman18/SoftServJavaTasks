import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public List<String> readText() throws IOException {
        List<String> textArrayList = new ArrayList<>();
        System.out.println("InPut Link text: ");
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(new InPutArguments().inPutFileLink()));
                String line = fileReader.readLine();
                while (line != null) {
                    textArrayList.add(line);
                    line = fileReader.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Enter wrong way");
            }
        return textArrayList;
    }

    public String changeString() throws IndexOutOfBoundsException {
        String inPutString = "";
        try {
            inPutString = new InPutArguments().getInPutChangeStringNumber();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return inPutString;
    }
}

