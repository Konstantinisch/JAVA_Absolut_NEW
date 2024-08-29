package de.telran.lesson_2.polymorphism;

public class MainDynPolym {
    public static void main(String[] args) {
        //tolko na pereopredelenii metodov
        //dinam poly pri rabote c predkom
        Dance dance = new Dance("Vasja", 15);
        dance.dance();

        HipHopDance hipHopDance = new HipHopDance("Peter", 18);
        hipHopDance.dance();

        BreakDance breakDance = new BreakDance("Grischa", 19);
        breakDance.dance();

        Dance dance1 = new HipHopDance("Leonid", 20);
        dance1.dance();

        dance1 = breakDance;
        dance1.dance();

//        hipHopDance = breakDance; //nelsja potomu

        Dance[] prog1 = {dance, hipHopDance, breakDance};
        koncert(prog1);

        System.out.println();

        //abstrakt klass singer - dinam poly pri rabote c abstraktnimi classami
        // Singer singer = new Singer ("Dascha");// ne mogu sosdat objekt abstraktnogo classa



        Singer singer1 = new PopSinger("Mascha");
        singer1.sing();

        singer1 = new RockSinger("Dalila");
        singer1.sing();

        //interface Playable -dinam poly pri rabote c interface
        //Playable playable = new Playable(); // ne mogu sosdat objekt interface

        System.out.println();


        //suzenie funnkzionala do povedenija , kotoroe predstavlena v interface
        Playable playable = new ReperPlay("Miron");
        playable.play();
        playable.speak();

        ReperPlay reperPlay = new ReperPlay("Limon");
        reperPlay.play();
        reperPlay.speak();
        reperPlay.dance();// metod dostupen v classe


    }

    static void koncert(Dance[] arr) {
        System.out.println(" === Our koncert ===");
        for (Dance dance : arr)
            dance.dance();
    }
}
