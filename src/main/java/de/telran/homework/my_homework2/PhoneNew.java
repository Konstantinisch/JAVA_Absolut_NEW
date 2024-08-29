package de.telran.homework.my_homework2;

public class PhoneNew {
//    2.Класс Phone.
//    Создайте класс Phone, который содержит переменные number, model и weight.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных.
//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.

    int number;
    String model;
    int weight;
    String name;

    public void receiveCall(String name){
        System.out.println(name+" is calling to "+number+" from mobil names "+model+" with weight "+weight+".");
    }

    public int getNumber(int number) {
        return number;
    }

}
