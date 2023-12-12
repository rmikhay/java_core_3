package org.example.homework.third.ex2;

public class Board {
    private final String name;
    private final int width;
    private final int length;
    private final int height;

    public Board(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Плата: " + name
                + " (" + width
                + "x" + length
                + "x" + height + ")";
    }
}
