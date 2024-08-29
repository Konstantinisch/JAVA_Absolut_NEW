package de.telran.lesson_2.interface1;

public class Voron extends Bird{

    @Override
    public void fly() {
        System.out.println(name+ " flying like voron");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" -- krichit KaRR");
    }
}
