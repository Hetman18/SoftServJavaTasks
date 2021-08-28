import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

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

    public void writeChangeTextToFile() throws IOException {
        Program program = new Program();
        List<String> textList = program.changeStartText();
        String fileLink = program.getLink();
        File file = new File(fileLink);
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        for (String textString : textList) {
            fileWriter.write(textString + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }


}

