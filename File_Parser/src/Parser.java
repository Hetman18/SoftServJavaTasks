import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String inPutArguments;

    public String getInPutArguments() throws IOException {
        System.out.println("Enter new line: ");
        inPutArguments = reader.readLine();
        return inPutArguments;
    }

    public List<String> readText() throws IOException {
        List<String> textArrayList = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("D:/JavaGit/SoftServJavaTasks/File_Parser/Resources/Text.txt"));
        String line = fileReader.readLine();
        while (line != null) {
            textArrayList.add(line);
            line = fileReader.readLine();
        }
        return textArrayList;
    }

    public int matchText() throws IOException {
        int matcherCount = 0;
        for (String str : readText()) {
            Pattern pattern = Pattern.compile("М.л(\\w*)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcherCount++;
            }
        }
        System.out.println(matcherCount);
        return matcherCount;
    }

    public String changeString() throws IOException {
        String inPutString = readText().get(1);
        Pattern patternReplace = Pattern.compile(inPutString);
        Matcher matcherReplace = patternReplace.matcher(inPutString);
        inPutString = matcherReplace.replaceAll(getInPutArguments());
        return inPutString;
    }

    public List<String> changeStartText() throws IOException {
        List<String> changeTextArray = readText();
        String changeStr = changeString();
        changeTextArray.set(1, changeStr);
        return changeTextArray;
    }




}

