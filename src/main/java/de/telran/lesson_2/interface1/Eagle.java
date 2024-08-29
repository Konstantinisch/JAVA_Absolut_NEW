package de.telran.lesson_2.interface1;

public class Eagle extends Bird{
    boolean isPradator;

    @Override
    public void fly() {
        System.out.println(name+" Flying like Eagle");
    }

    @Override
    public void makeSound() {
        System.out.println(name+ " --krichit like Eagle");
    }
}
