package de.telran;

import de.telran.practice_Lesson1.Book;
import de.telran.practice_Lesson1.Library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();

        Book book1 = new Book("Book1", "Duma", 1988 );
        Book book2 = new Book("Book2", "Kuri", 1980 );
        Book book3 = new Book("Book3", "Moor", 1925 );
        Book book4 = new Book("Book4", "Duma", 1988 );
        Book book5 = new Book("Book5", "Kuri", 1980 );
        Book book6 = new Book("Book6", "Moor", 1925 );


        library1.setBook1(book1);
        library1.setBook2(book2);
        library1.setBook3(book3);

        library2.setBook1(book4);
        library2.setBook2(book5);
        library2.setBook3(book6);

        System.out.println("Books of 1 Library");
        library1.printBooks();
        System.out.println("Books of 2 Library");
        library2.printBooks();




    }
}
