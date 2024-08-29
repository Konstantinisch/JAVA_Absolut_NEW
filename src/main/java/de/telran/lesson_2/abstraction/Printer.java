package de.telran.lesson_2.abstraction;

abstract public class Printer {
    String name;
    String model;
    int year;

    public Printer() {
        System.out.println("----Rabotaet konstructor");
    }

    void repair(){
        System.out.println("Braucht einen Meister zum Reparatur tel.1111");
    }

    void service() {
        System.out.println("Braucht Meister anrufen tel 2222");
    }

    //sapravljat
    abstract void refill();



    //pechatat
    abstract void print();

}
