package de.telran.lesson_2.polymorphism;

public class MainStatPolym { //peregruska metoda-primer static polymorphisma vremeni kompiljazii
    static int add(int v1, int v2) {
        System.out.println("Vipolnjaetsa int add(int v1, int v2");
        return v1+v2;
    }
    //nelsja use potomu cto analis tolko tipi argumentov a ne imja peremennih
//    static int add(int v2, int v1) {
//        System.out.println("Vipolnjaetsa int add(int v1, int v2");
//        return v1+v2;
//    }

    //kompiljator vosprinimaet metod kak dublikat
//    static double add(int v1, int v2) {
//        System.out.println("Vipolnjaetsa int add(int v1, int v2");
//        return (double)v1+v2;
//    }
    static double add(double v1, double v2) {
        System.out.println("Vipolnjaetsa double add(double v1, double v2");
        return v1 + v2;
    }
    static double add(int v1, double v2) {
        System.out.println("Vipolnjaetsa double add(int v1, double v2");
        return v1 + v2;
    }

    public static void main(String[] args) {
        System.out.println(add(5,8));
        System.out.println(add(1.0, 3.5));
        System.out.println(add(1L, 3.5));

        System.out.println(add(1L, 3.5));
    }
}
