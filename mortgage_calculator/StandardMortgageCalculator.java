package mortgage_calculator;

public class StandardMortgageCalculator implements MortgageCalculator {
    @Override
    public double calculate(int principal, float annualRate, byte years) {
        float monthlyRate = annualRate / 100 / 12;
        int numberOfPayments = years * 12;

        return principal * 
               (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / 
               (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
    }
}