package org.example.homework.third.ex2;

public class Factory {
    public void createPhone(Iphone iphone) {
        iphone.setOperatingSystem("IOS");
        iphone.setBoard(new Board("7uik", 15, 12, 13));
        iphone.setCamera(new Camera("iphone", 15, true));
        System.out.println(iphone);
    }

    public void createPhone(Samsung samsung) {
        samsung.setOperatingSystem("Android");
        samsung.setBoard(new Board("j-108", 10, 12, 13));
        samsung.setCamera(new Camera("Samsung", 20));
        System.out.println(samsung);
    }

}


