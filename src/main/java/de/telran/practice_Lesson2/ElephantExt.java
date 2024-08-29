package de.telran.practice_Lesson2;

public class ElephantExt extends Animal{
    public ElephantExt(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trubit ");
    }

    @Override
    public String getHairType() {
        String type = "not bushy";
        System.out.println(type);
        return type;
    }
}
