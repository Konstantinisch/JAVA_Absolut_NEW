package de.telran.homework.my_homework2;

public class AllPhones {
    public static void main(String[] args) {
        PhoneNew some1 = new PhoneNew();
        some1.number = 3332211;
        some1.model = "Nokia";
        some1.weight = 120;
        some1.name = "Alex";
        some1.receiveCall(some1.name);
        some1.getNumber(some1.number);
        System.out.println(some1.getNumber(some1.number));


        PhoneNew some2 = new PhoneNew();
        some2.number = 4445566;
        some2.model = "Samsung";
        some2.weight = 170;
        some2.name = "Peter";
        some2.receiveCall(some2.name);
        some2.getNumber(some2.number);
        System.out.println(some2.getNumber(some2.number));


        PhoneNew some3 = new PhoneNew();
        some3.number = 9998877;
        some3.model = "Alcatel";
        some3.weight = 100;
        some3.name = "Mario";
        some3.receiveCall(some3.name);
        some3.getNumber(some3.number);
        System.out.println(some3.getNumber(some3.number));
    }



}
