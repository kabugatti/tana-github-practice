package mortgage_calculator;

import java.text.NumberFormat;

public class ResultFormatter {
    private static final NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    public static String formatMortgage(double mortgage) {
        return currencyFormatter.format(mortgage);
    }
}