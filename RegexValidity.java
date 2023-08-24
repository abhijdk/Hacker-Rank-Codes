import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int numTestCases = Integer.parseInt(scanner.nextLine());
        
        // Process each test case
        for (int i = 0; i < numTestCases; i++) {
            String patternString = scanner.nextLine().trim();
            String result = checkRegexValidity(patternString);
            System.out.println(result);
        }
    }
    
    public static String checkRegexValidity(String patternString) {
        try {
            Pattern.compile(patternString);
            return "Valid";
        } catch (PatternSyntaxException e) {
            return "Invalid";
        }
    }
}
