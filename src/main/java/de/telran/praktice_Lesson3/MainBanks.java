package de.telran.praktice_Lesson3;

public class MainBanks {
    public static void main(String[] args) {
        AlfaBank alfaBank = new AlfaBank();
        BetaBank betaBank = new BetaBank();
        GamaBank gamaBank = new GamaBank();

        Client client1 = new Client("Ilja", 15, 32000);
        Client client2 = new Client("Peter", 25, 12000);

        checkPossibilityClient(client1, alfaBank);

        getDiscountInfo(client1.needSum, alfaBank);
        getDiscountInfo(client2.needSum, alfaBank);


        System.out.println("Raiting banka" + alfaBank.name + " " + alfaBank.calculateRating());

        checkPossibilityClient(client1, betaBank);
        checkPossibilityClient(client1, gamaBank);
        System.out.println(alfaBank.calculateMonthlyPayment(1000, 24000));


    }

    public static void checkPossibilityClient(Client client, Bank bank) {
        if (bank.checkAge(client.age) && bank.checkSum(client.needSum)) {
            System.out.println("For bank " + bank.name + " kredit clientu" + client.name + " vosmozen");
        } else {
            System.out.println("For bank " + bank.name + " kredit clientu " + client.name + "nevosmoyen");
        }
    }

    public static void getDiscountInfo(double needSum, AlfaBank bank) {
        double discount = bank.calculateLoyaltyDiscount(needSum);
        System.out.println(" For " + bank.name + " " + discount);
    }
}