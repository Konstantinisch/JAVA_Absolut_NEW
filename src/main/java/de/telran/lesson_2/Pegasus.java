package de.telran.lesson_2;

public class Pegasus {//dublirovanie koda
    String name;
    String color;
    int weight; //kolichestvo grusa
    int countWings;

    public Pegasus(String name, String color, int weight, int countWings) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.countWings = countWings;
    }

    public void run() {
        System.out.println("Bezit loschad "+name+"zwet "+color);
    }
    public void transport(){
        System.out.println("Loschad "+name+" veset grus vesom "+weight);
    }

    public void fly() {
        System.out.println("Letit "+name+" zvet "+color+" s grusom "+weight);

    }
}
