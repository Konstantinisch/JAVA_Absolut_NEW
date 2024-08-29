package de.telran.practice_Lesson2;

public class BearExt extends Animal{
    public BearExt(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name+" makes sound");
    }
}
