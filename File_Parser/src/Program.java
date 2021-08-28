import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    private String link;

    public String getLink() {
        return link;
    }

    public List<String> readText() throws IOException {
        List<String> textArrayList = new ArrayList<>();
        boolean isSuxesfull = false;
        while (!isSuxesfull) {
            System.out.println("InPut file Link: ");
//            File text = new File(new InPutArguments().inPutFileLink());
            link = new InPutArguments().inPutFileLink();
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(link));
                String line = fileReader.readLine();
                while (line != null) {
                    textArrayList.add(line);
                    line = fileReader.readLine();
                }
                isSuxesfull = true;
            } catch (FileNotFoundException e) {
                System.out.println("Enter wrong way");
            }
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

    public List<String> changeStartText() throws IOException {
        List<String> changeTextArray = readText();
        String changeStr = changeString();
        try {
            changeTextArray.set(new InPutArguments().choseIndexOfString(), changeStr);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Enter wrong index!");
        }
        return changeTextArray;
    }
}


//    public File getFileLink() {
//        System.out.println("Enter file Link: ");
//        File startFile = new File((new InPutArguments().inPutFileLink()));
//        return startFile;
//    }