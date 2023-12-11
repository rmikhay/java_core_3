package org.example.homework.third.ex2;

public abstract class Phone {

    protected Board board;
    protected String modelName;

    protected Camera camera;

    protected String operatingSystem;

    public Phone() {
    }

    public Phone(String modelName) {
        this.modelName = modelName;
    }

    protected void setBoard(Board board) {
        this.board = board;
    }

    protected void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    protected void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return this.modelName + "\n" + board.toString() + "\n"
                + "Операционная система: " + operatingSystem + "\n"
                + camera.toString() + "\n";
    }

}
