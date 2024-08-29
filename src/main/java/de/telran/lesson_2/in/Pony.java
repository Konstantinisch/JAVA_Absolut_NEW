package de.telran.lesson_2.in;

import de.telran.lesson_2.Horse;


////public class Pony extends de.telran.Lesson_2.Horse{//polnoe naimenovanie klassa
//}
public class Pony extends Horse {//Horse kratkoe naimenovania klassa (nuzno use import)
    int height; //rost

    public Pony() {
    }

    public Pony(String name1, String color1, int weight1, int height) {
        super(name1, color1, weight1);
        this.height = height;
    }

    public void transportsChildren() {
        System.out.println(name+ "zvet " +super.color+" kataet detej");
    }
}
