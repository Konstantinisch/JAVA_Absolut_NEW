package de.telran.practice_Lesson1;

public class Library {
    private Book book1;
    private Book book2;
    private Book book3;

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    public void printBooks() {
        if (book1 != null) {
            System.out.println("book1: " + book1.toString() + "\n");
        }
        if (book2 != null){
            System.out.println("book2: " + book2.toString() + "\n");
        }
        if(book3 != null){
            System.out.println("book3: " + book3.toString() + "\n");
        }


    }
}
