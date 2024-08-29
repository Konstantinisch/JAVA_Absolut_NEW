package de.telran.lesson_2;

public class UnicornRace extends UnicornExt{
    int countPassengers;

    public UnicornRace(String name1, String color1, int weight1, int countHorn, int countPassengers) {
        super(name1, color1, weight1, countHorn);
        this.countPassengers = countPassengers;
    }

    public void transportPassengers() {
        System.out.println(name+ " mozet vosit "+countPassengers+" passagers");
    }
}
