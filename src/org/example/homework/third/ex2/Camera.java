package org.example.homework.third.ex2;

public class Camera {
    private final String name;
    private boolean isThereFlash;
    private final int zoom;

    public Camera(String name, int zoom) {
        this.name = name;
        this.zoom = zoom;
    }

    public Camera(String name, int zoom, boolean isThereFlash) {
        this.name = name;
        this.zoom = zoom;
        this.isThereFlash = isThereFlash;
    }

    @Override
    public String toString() {
        if (this.isThereFlash) {
            return "Камера: "
                    + name
                    + ", Zoom:" + zoom
                    + "x есть вспышка";
        }
        return "Камера: "
                + name
                + ", Zoom:" + zoom + "x";
    }
}

