package de.telran.lesson_2.polymorphism;

public class ReperPlay implements Playable{
    String name;

    public ReperPlay(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name+" Playing instrument");
    }

    @Override
    public void speak() {
        System.out.println(name+" sch;n speaking rap");
    }

    public void dance(){
        System.out.println(name+ " umeet tanzen pod rep");
    }
}
