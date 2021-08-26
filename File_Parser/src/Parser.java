import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getInPutArguments() throws IOException {
        System.out.println("Enter new line: ");
        return reader.readLine();
    }

    public int matchText(Program textArray, InPutArguments matchText) throws IOException {
        int matcherCount = 0;
        Pattern pattern = Pattern.compile(matchText.inPutMatchText(),
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        for (String str : textArray.readText()) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcherCount++;
            }
        }
        System.out.println(matcherCount);
        return matcherCount;
    }
    public List<String> changeStartText() throws IOException {
        List<String> changeTextArray = new Program().readText();
        String changeStr = new Program().changeString();
        try {
            changeTextArray.set(new InPutArguments().choseIndexOfString(), changeStr);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Enter wrong index!");
        }
        return changeTextArray;
    }

    public void writeChangeTextToFile() throws IOException {
        List<String> textList = changeStartText();
        File file = new File("File_Parser/src/Next.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        for (String textString : textList) {
            fileWriter.write(textString + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }
}

