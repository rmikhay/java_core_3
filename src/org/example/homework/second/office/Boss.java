package org.example.homework.second.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public void rush(Manager manager) {
        System.out.println(manager.getName() + ", быстрее!");
    }

    public String getName() {
        return name;
    }
}
