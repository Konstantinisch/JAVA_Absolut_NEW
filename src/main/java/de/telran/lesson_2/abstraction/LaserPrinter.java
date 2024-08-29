package de.telran.lesson_2.abstraction;

public class LaserPrinter extends Printer{
    int countPrintPages; //kolichestvo listov, kotorie on mozet napechatat na odnoj zapravke

    public LaserPrinter(String name, String model, int year, int countPrintPages) {
        System.out.println("------Rabotaet konstruktor :: LaserPrinter()");
        super.name = name;
        super.model = model;
        this.year = year;// hotja eta peremennaja objavlenna v predke, no ona uze unasledovanna potomkom, poetomu mozno use "this"
        this.countPrintPages = countPrintPages;

    }

    @Override
    void refill() {
        System.out.println(name+" Sapravljaetsa samenoj lasernogo kartrizd");
    }

    @Override
    void print() {
        System.out.println(name+" pechataet s pomoschju lasera i tonera");
    }
}
