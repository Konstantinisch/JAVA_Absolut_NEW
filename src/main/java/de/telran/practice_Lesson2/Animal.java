package de.telran.practice_Lesson2;

public class Animal {
    String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getHairType() {
        String type = "bushy";
        System.out.println(type);
        return type;
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
