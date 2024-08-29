package de.telran.lesson_2.in;

import de.telran.lesson_2.Horse;

public class SimpleExt {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.name = "Chuzaja loschad";

        horse.run();
        horse.transport();
        System.out.println();

        Pony pony =new Pony();
        pony.name = "Poni Moni";
        pony.height = 1;
        pony.run();
        pony.transport();
        pony.transportsChildren();

        System.out.println();

        Pony pony1= new Pony("Poni marusja", "Raduznij",50,1);
        pony1.run();
        pony1.transport();
        pony1.transportsChildren();


    }
}
