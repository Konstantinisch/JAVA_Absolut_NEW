package de.telran.lesson_2;

public class Horse {
    public String name;
    protected String color;//dostup potomkam
    int weight;//kolichestvo grusa
    private int countTooth; //ne nasleduetsa potomkami

    static int count; //obschee kol proisvedennih loschadej

    public Horse() {
        count++;
    }

    public Horse(String name1, String color1, int weight1) {
        this.name = name1;
        this.color = color1;
        this.weight = weight1;
        count++;
    }

    public Horse(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public void run() {
        System.out.println("Bezit kak loschad "+name+"zwet "+color+" Zubi "+countTooth);
    }
    public void transport(){
        System.out.println(name+" veset grus vesom "+weight+ "kak loschad");
    }

    private void addTooth() {
        System.out.println(name+" imel"+countTooth+ " Zubov");
        countTooth+= countTooth;
        System.out.println(name+" posle vstavki uze imeet "+countTooth+" Zubov");
    }



}
