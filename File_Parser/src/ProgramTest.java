import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void positiveTestMatchText8() {
        List<String> readText = new ArrayList<>();
        readText.add("Не жалела мама мыла.");
        readText.add("Мама Милу мылом мыла.");
        readText.add("Мила мыла не любила,");
        readText.add("Мыло Мила уронила.");
        int matcherCount = 0;
        Pattern pattern = Pattern.compile("м.л",
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        for (String str : readText) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcherCount++;
            }
        }
        assertEquals(8, matcherCount);
    }

    @Test
    void negativeTestMatchText0() {
        List<String> readText = new ArrayList<>();
        readText.add("Не жалела мама мыла.");
        readText.add("Мама Милу мылом мыла.");
        readText.add("Мила мыла не любила,");
        readText.add("Мыло Мила уронила.");
        int matcherCount = 0;
        Pattern pattern = Pattern.compile("р.н",
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        for (String str : readText) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                matcherCount++;
            }
        }
        assertNotEquals(0, matcherCount);
    }
}