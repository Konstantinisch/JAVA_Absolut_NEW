package de.telran.practice_Lesson2;

public class MonkeyExt extends Animal{
    public MonkeyExt(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name+" Jumping ");
    }
}
