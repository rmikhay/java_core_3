package org.example.homework.second.shop;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item("Молот", 1000);
        Item turnScrew = new Item("Отвертка", 50);
        Item notebook = new Item("Тетрадь", 30);
        Item pen = new Item("Ручка", 10);
        Worker vasiliy = new Worker("Василий", "мужчина", 30, hammer, turnScrew);
        Worker maryana = new Worker("Марьяна", "женщина", 25, notebook, pen);
        Shop shop = new Shop(vasiliy, maryana);
        shop.printAll();
        for (Worker worker : shop.getWorkers()) {
            worker.boast();
        }
    }
}