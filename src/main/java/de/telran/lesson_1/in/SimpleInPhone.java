package de.telran.lesson_1.in;

import de.telran.lesson_1.Phone;

public class SimpleInPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Inwork");
        phone1.call();
       // phone1.model = ""; // sapreschen dostup
        phone1.setModel(""); // cheres setter mozem prisvoit snachenie
    }
}
