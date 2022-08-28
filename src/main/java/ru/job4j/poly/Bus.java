package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int number) {
        return 0;
    }

    @Override
    public double fuel(double amount) {
        return 0;
    }
}
