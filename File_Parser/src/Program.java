import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public int matchText() throws IOException {
        int matcherCount = 0;
        Pattern pattern = Pattern.compile(new InPutArguments().inPutMatchText(),
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        for (String str : readText()) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcherCount++;
            }
        }
        System.out.println(matcherCount);
        return matcherCount;
    }

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

    public String changeString() throws IOException {
        String inPutString = "";
        try {
            inPutString = new InPutArguments().inPutChangeStringNumber();
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
        }catch (IndexOutOfBoundsException e){
            System.out.println("Enter wrong index!");
        }
        return changeTextArray;
    }
}



//    public String changeString() throws IOException {
//        String inPutString = "";
//        try {
//            inPutString = readText().get(new InPutArguments().inPutChangeStringNumber());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        Pattern patternReplace = Pattern.compile(inPutString);
//        Matcher matcherReplace = patternReplace.matcher(inPutString);
//        inPutString = matcherReplace.replaceAll(new Parser().getInPutArguments());
//        return inPutString;
//    }
