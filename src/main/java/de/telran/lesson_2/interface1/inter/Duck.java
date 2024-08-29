package de.telran.lesson_2.interface1.inter;

public class Duck  implements Flyable, Soundable, SwimDivingable {

    @Override
    public void fly() {
        System.out.println(" letaet like utka");
    }

    @Override
    public void makeSound() {
        System.out.println("Krjakaet");
    }

    @Override
    public void swim() {
        System.out.println("Swimming use pereponki");
    }


}
