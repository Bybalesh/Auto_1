package ru.netology.UnitService;

public class Service {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

}
