import java.util.Scanner;

public class StringSolution2 {
public static String getSmallestAndLargest(String s, int k) {
        String smallest = null;
        String largest = null;

        String[] substrings = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            substrings[i] = s.substring(i, i + k);
        }

        java.util.Arrays.sort(substrings);

        smallest = substrings[0];
        largest = substrings[substrings.length - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
