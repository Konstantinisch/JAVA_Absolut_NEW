package de.telran.praktice_Lesson3;

public  abstract class Bank {
    String name;
    double rate;
    int maxSum;
    int minClientAge;

    public Bank(String name, double rate, int maxSum, int minClientAge) {
        this.name = name;
        this.rate = rate;
        this.maxSum = maxSum;
        this.minClientAge = minClientAge;
    }

    public boolean checkAge (int age) {
        return age >= minClientAge;
    }

    public boolean checkSum ( int sum){
        return sum <= maxSum;
    }

     public abstract double calculateMonthlyPayment (int sum, double rate);


    public void printAllInfo(){
        System.out.print("Name of bank:" +name+ "\n" + " Prozentnaja stavka: "+rate+ "\n"
                + "Maximal summa kredita:" + maxSum+ "\n" + " Minimalnij age of client:"+minClientAge);
    }
}
