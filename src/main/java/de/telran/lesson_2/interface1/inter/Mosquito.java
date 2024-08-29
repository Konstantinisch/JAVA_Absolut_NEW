package de.telran.lesson_2.interface1.inter;

public class Mosquito implements Flyable, Soundable{
    String name;
    boolean isBlood;


    public Mosquito(String name, boolean isBlood) {
        this.name = name;
        this.isBlood = isBlood;
    }

    @Override
    public void fly() {
        System.out.println(name+ " flying like komar");
    }

    @Override
    public void makeSound() {
        System.out.println(name+ "ZZuzit");
    }
}
