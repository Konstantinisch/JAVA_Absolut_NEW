package de.telran.lesson_2.interface1.inter;

public class Submarine implements Soundable, SwimDivingable{
    @Override
    public void makeSound() {
        System.out.println("HJK");
    }

    @Override
    public void swim() {
        System.out.println("yrtryrur");
    }

    @Override
    public void diving() {
        System.out.println("diving under water use big tanks");
    }
}
