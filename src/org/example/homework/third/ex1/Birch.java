package org.example.homework.third.ex1;

public class Birch extends Deciduous {
    public Birch(int age, boolean leavesNow) {
        super(age, leavesNow);
        if (leavesNow) {
            allergy();
        }
    }

    public void allergy() {
        System.out.println("Источает аллергены");
    }
}
