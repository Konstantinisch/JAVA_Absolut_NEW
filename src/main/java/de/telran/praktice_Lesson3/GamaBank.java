package de.telran.praktice_Lesson3;

public class GamaBank extends Bank implements LoyaltyProgram{
    public GamaBank() {
        super("Gama",12, 45000, 18);
    }

    @Override
    public double calculateMonthlyPayment(int sum, double rate) {
        double result =  sum /100*rate/12;
        return result;
    }

    @Override
    public double calculateLoyaltyDiscount(double amount) {
        if (amount > 10000) {
            return amount * 0.01;
        } else {
            return 0;
        }
    }

    @Override
    public String getBankInfo() {
        // Возвращаем общую информацию о банке
        return String.format("Bank Name: %s\nInterest Rate: %.1f%%\nMax Loan Amount: %",
                name, rate, maxSum);
    }
}
