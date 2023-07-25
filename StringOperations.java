package hacker_rank_codes;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();

        // Sum the lengths of A and B
        int sumLengths = A.length() + B.length();
        System.out.println(sumLengths);

        // Determine if A is lexicographically larger than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in A and B and print them on a single line
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
