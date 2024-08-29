package de.telran.lesson_2.interface1.inter;

public interface  SwimDivingable { //extends Soundable, Flyable i t.d. //nasledovanie interface rasrescheno
    void swim();

//realisazija po umolchaniju
    default void diving(){  //posle Java8 versii
        System.out.println("Diving under water");
    };


}
