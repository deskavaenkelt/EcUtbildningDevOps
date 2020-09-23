package se.dsve;

public class Exercise8 {
    private final double investment;
    private final double interestRate;
    private final int investmentYears;

    public Exercise8(double investment, double interestRate, int investmentYears) {
        this.investment = investment;
        this.interestRate = interestRate;
        this.investmentYears = investmentYears;
    }

    public void printInterest() {
        System.out.println("8. Write a Java method to compute the future investment value at a given interest rate for a specified number of years.");
        printStartingStats();
        double interestRateInPercent = this.interestRate * 0.01;
        printResult(interestRateInPercent);
    }

    private void printStartingStats() {
        System.out.println("Investment amount: " + this.investment);
        System.out.println("Interest rate %: " + this.interestRate);
        System.out.println("Number of years: " + this.investmentYears);
        System.out.println("Years    FutureValue");
    }

    private void printResult(double interestRateInPercent) {
        for (int year = 0; year <= this.investmentYears; year++) {
            int formatter = 19;
            if (year >= 10) formatter = 18;

            double newInterest = monthlyCompounded(this.investment, interestRateInPercent, year);
            System.out.printf(year + "%" + formatter + ".2f\n", newInterest);
        }
    }

    private double monthlyCompounded(double investedAmount, double yearlyInterestRate, int years) {
        double monthlyInterestRate = yearlyInterestRate / 12;
        double monthsTimesNumberOfYears = years * 12;
        monthlyInterestRate += 1;
        return investedAmount * Math.pow(monthlyInterestRate, monthsTimesNumberOfYears);
    }
}
