package org.example.homework.third.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        House[] housesCopy = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            House house = new House(houses[i].getStreet(), houses[i].getHouseNumber());
            housesCopy[i] = house;
        }
        this.houses = housesCopy;
    }

    @Override
    public String toString() {
        return "City{"
                + "name='" + name + '\''
                + ", houses=" + Arrays.toString(this.houses)
                + '}';
    }
}
