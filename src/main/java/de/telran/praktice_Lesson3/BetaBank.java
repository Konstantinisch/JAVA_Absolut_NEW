package de.telran.praktice_Lesson3;

public class BetaBank extends Bank implements LoyaltyProgram,RatingSystem {

    public BetaBank() {
        super("Beta", 9.0, 20000, 20);
    }

    @Override
    public double calculateMonthlyPayment(int sum, double rate) {
        double result = sum / 100 * rate / 12;
        return result;
    }

    @Override
    public double calculateLoyaltyDiscount(double amount) {
        if (amount > 1000) {
            return amount * 0.01;
        } else {
            return 0;
        }
    }

    @Override
    public String getBankInfo() {
        return String.format("Bank Name: %s\nInterest Rate: %.1f%%\nMax Loan Amount: %",
                name, rate, maxSum);
    }

    @Override
    public double calculateRating() {
        // Пример расчета рейтинга: низкий процент и высокий лимит кредита дают высокий рейтинг
        return 10 - rate / 2; // Чем ниже процент, тем выше рейтинг
    }
}
