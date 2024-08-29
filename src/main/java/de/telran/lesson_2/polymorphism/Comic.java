package de.telran.lesson_2.polymorphism;

public class Comic implements Playable{
    String name;

    public Comic(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name+" Playing na nervah");
    }

    @Override
    public void speak() {
        System.out.println(name+" speaking lustige history");
    }
}
