package mortgage_calculator;

public class MortgageApp {
    public static void main(String[] args) {
        int principal = InputReader.readPrincipal();
        float rate = InputReader.readRate();
        byte years = InputReader.readYears();

        MortgageCalculator calculator = new StandardMortgageCalculator();
        double mortgage = calculator.calculate(principal, rate, years);

        String formattedMortgage = ResultFormatter.formatMortgage(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);

        InputReader.close();
    }
}