package org.example.homework.second.shop;

public class Worker {
    String name;
    String sex;
    int age;
    Item[] items;

    public Worker(String name, String sex, int age, Item... items) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void boast() {
        for (Item item : items) {
            System.out.println(name + ": смотрите какая у меня вещь - " + item.getName());
        }
    }
}
