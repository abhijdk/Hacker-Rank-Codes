import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MySolutions {
    public static void main(String[] args) {
        //double amount = 12324.134;

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();
        
        // Format for US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedUS = usFormat.format(amount);

        // Format for Indian currency
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String formattedIndia = indiaFormat.format(amount);

        // Format for Chinese currency
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String formattedChina = chinaFormat.format(amount);

        // Format for French currency
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String formattedFrance = franceFormat.format(amount);

        // Print the formatted values
        System.out.println("US: " + formattedUS);
        System.out.println("India: " + formattedIndia);
        System.out.println("China: " + formattedChina);
        System.out.println("France: " + formattedFrance);
    }
}
