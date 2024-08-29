package de.telran.practice_Lesson2;

public class LionExt extends Animal{
    public LionExt(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion makes sound");
    }
}
