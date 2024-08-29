package de.telran.lesson_2;

public class SimpleExtends {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.name = "Grischa";
        horse1.color = "Gnedoj";
        horse1.weight = 100;
        horse1.run();
        horse1.transport();
        System.out.println();


        Horse horse2 = new Horse("Vasja", "belij", 50);
        horse2.run();
        horse2.transport();

        Horse horse3 = new Horse("Petja", "V jablokah");
        horse3.weight = 70;
        horse3.run();
        horse3.transport();
        System.out.println();


        System.out.println(Horse.count + " obschee kolichestvo loschadej");


//dublirovanie koda
//        Pegasus pegasus1 = new Pegasus("Sema", "black",20,2);
//        pegasus1.run();
//        pegasus1.transport();
//        pegasus1.fly();
//        System.out.println();

        PegasusExt pegasusExt = new PegasusExt("Pinki", "rosa", 10,2);
        pegasusExt.fly();
        pegasusExt.run();
        pegasusExt.transport();
        System.out.println();


        UnicornExt unicornExt = new UnicornExt("Bur", "serji", 30,1);
        unicornExt.run();
        unicornExt.transport();
        unicornExt.butt();
        System.out.println();

        UnicornRace unicornRace = new UnicornRace("Musja", "Lila", 80, 2,3);
        unicornRace.run();
        unicornRace.transport();
        unicornRace.butt();
        unicornRace.transport();
        System.out.println();

        System.out.println(Horse.count + " obschee kolichestvo loschadej");

        //primer polym i operation suzenija funktionala i sostojanija do teh, kot est tolko u predka.
        Horse horse;
        horse = new PegasusExt("Peggi", "blue", 12, 2);
        horse.transport();// blagodorja polymorphismu pobedenie budet kak u Pegasa

    }
}
