package de.telran.homework.my_homework1;

public class Person {

//     1 уровень сложности: 1.Класс module1.lecture1.module1.lecture1.Person
//    Создать класс module1.lecture1.module1.lecture1.Person, который содержит:
//    переменные fullName, age;
//    методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module1.lecture1.module1.lecture1.Person говорит".
//    Добавьте два конструктора  - module1.lecture1.module1.lecture1.Person() и module1.lecture1.module1.lecture1.Person(fullName, age).
//    Создайте два объекта этого класса. Один объект инициализируется конструктором module1.lecture1.module1.lecture1.Person(), другой - module1.lecture1.module1.lecture1.Person(fullName, age)

    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Someone of module1.lecture1.module1.lecture1.Person is speaking");
    }

    void talk() {
        System.out.println("Someone of module1.lecture1.module1.lecture1.Person is speaking");
    }

    Person person1 = new Person();
    Person person2 = new Person("Schneider", 35);

}
