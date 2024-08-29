package de.telran.lesson_2.interface1.inter;

public class Plane implements Flyable, Soundable{
    String name;
    int countPassengers;

    void service(){
        System.out.println(name+ " pered vsletom sdelat service");
    }

    @Override
    public void fly() {
        System.out.println(name+" flying like plane");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" schumit s pom. dvigatelja");
    }
}
