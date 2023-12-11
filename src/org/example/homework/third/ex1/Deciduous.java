package org.example.homework.third.ex1;

public class Deciduous extends Tree {
    protected boolean leavesNow;

    public Deciduous(int age, boolean leavesNow) {
        super(age);
        this.leavesNow = leavesNow;
    }

    public void fallLeaves() {
        this.leavesNow = false;
    }

    public void blossom() {
        this.leavesNow = true;
    }
}
