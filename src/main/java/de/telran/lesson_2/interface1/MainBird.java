package de.telran.lesson_2.interface1;

public class MainBird {
    public static void main(String[] args) {
       // Bird bird = new Bird();//nevosmozno objekt abstraktnogo classa

        Eagle eagle = new Eagle();
        eagle.name = "Sokol";
        eagle.eat();
        eagle.fly();
        eagle.makeSound();

        Voron voron = new Voron();
        voron.name = "Karkusha";
        voron.eat();
        voron.fly();
        voron.makeSound();

    }
}
