package de.telran.lesson_2.interface1;

public abstract class Bird {
    String name;
    String color;

    public void eat() {
        System.out.println(name+" eating mit Schnabel");
    }
    public abstract void fly();

    public abstract void makeSound();
}
