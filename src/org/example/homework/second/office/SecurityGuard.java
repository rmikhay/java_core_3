package org.example.homework.second.office;

public class SecurityGuard {
    String name;

    public SecurityGuard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askForAdvance() {
        System.out.println("Дайте денюжек авансом.");
    }
}
