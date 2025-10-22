package mortgage_calculator;

public interface MortgageCalculator {
    double calculate(int principal, float annualRate, byte years);
}