import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float rate = scanner.nextFloat();

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();

        // Single validation loop for all inputs (DRY)
        boolean valid = false;
        while (!valid) {
            valid = true;

            if (principal < 1000 || principal > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                principal = scanner.nextInt();
                valid = false;
            }

            if (rate <= 0 || rate > 30) {
                System.out.println("Enter a value between 1 and 30");
                rate = scanner.nextFloat();
                valid = false;
            }

            if (years < 1 || years > 30) {
                System.out.println("Enter a number between 1 and 30");
                years = scanner.nextByte();
                valid = false;
            }
        }

    final float PERCENT = 100f;
    final int MONTHS_IN_YEAR = 12;

    float monthlyRate = rate / PERCENT / MONTHS_IN_YEAR;
    int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
                
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
