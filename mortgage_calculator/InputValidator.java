package mortgage_calculator;

public class InputValidator {
    public static boolean isValidPrincipal(int principal) {
        return principal >= 1000 && principal <= 1_000_000;
    }

    public static boolean isValidRate(float rate) {
        return rate > 0 && rate <= 30;
    }

    public static boolean isValidYears(byte years) {
        return years >= 1 && years <= 30;
    }

    public static String getErrorMessage(String field) {
        switch (field) {
            case "principal":
                return "Enter a number between 1,000 and 1,000,000";
            case "rate":
                return "Enter a value between 1 and 30";
            case "years":
                return "Enter a number between 1 and 30";
            default:
                return "Invalid input";
        }
    }
}