package de.telran.lesson_2;

public class PegasusExt extends Horse{//metod nasledovanija
    int countWings;

    public PegasusExt(String name1, String color1, int weight1, int countWings) {
        super(name1, color1, weight1);
        this.countWings = countWings;

    }

    public void fly() {
        System.out.println("Letit "+name+" zvet "+color+" s grusom "+weight);

    }

    @Override
    public void transport() {
        System.out.println(name+" perenosil grus vesom "+weight+" use wings "+countWings+" in the air");
    }
}
