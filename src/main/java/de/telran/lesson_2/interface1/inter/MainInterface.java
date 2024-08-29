package de.telran.lesson_2.interface1.inter;

public class MainInterface {
    public static void main(String[] args) {
        Mosquito mosquito = new Mosquito("Maljariinij komar", true);
        mosquito.fly();


        //Flyable flyable = new Flyable();//object interface sosdat ne mogu

        Plane plane = new Plane();
        plane.name = "Airbus";
        plane.service();
        plane.fly();
        plane.makeSound();

        System.out.println();

        Duck duck = new Duck();
        duck.fly();
        duck.makeSound();
        duck.swim();
        duck.diving();

        System.out.println();

        Submarine submarine = new Submarine();
        submarine.makeSound();
        submarine.swim();
        submarine.diving();

        Seafull seafull = new Seafull();
        seafull.fly();
        seafull.eat();
        seafull.diving();
        seafull.makeSound();
        seafull.swim();
    }
}
