package hacker_rank_codes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMachingAppliation {
    public static void main(String[] args) {
        String inputString = "ababbbaaabab";
        String pattern = "ab";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputString);

        int count = 0;
        while (m.find()) {
            count++;
            System.out.println("Found at index: " + m.start());
        }

        if (count > 0) {
            System.out.println("The pattern \"" + pattern + "\" is available " + count + " times in the string.");
        } else {
            System.out.println("The pattern \"" + pattern + "\" is not available in the string.");
        }
    }
}
