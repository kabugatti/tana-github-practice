package mortgage_calculator;

import java.util.Scanner;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readPrincipal() {
        int principal;
        do {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (!InputValidator.isValidPrincipal(principal)) {
                System.out.println(InputValidator.getErrorMessage("principal"));
            }
        } while (!InputValidator.isValidPrincipal(principal));
        return principal;
    }

    public static float readRate() {
        float rate;
        do {
            System.out.println("Annual Interest Rate: ");
            rate = scanner.nextFloat();
            if (!InputValidator.isValidRate(rate)) {
                System.out.println(InputValidator.getErrorMessage("rate"));
            }
        } while (!InputValidator.isValidRate(rate));
        return rate;
    }

    public static byte readYears() {
        byte years;
        do {
            System.out.println("Period (Years): ");
            years = scanner.nextByte();
            if (!InputValidator.isValidYears(years)) {
                System.out.println(InputValidator.getErrorMessage("years"));
            }
        } while (!InputValidator.isValidYears(years));
        return years;
    }

    public static void close() {
        scanner.close();
    }
}