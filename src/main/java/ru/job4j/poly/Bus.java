package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int number) {
        System.out.println(20);
    }

    @Override
    public double fuel(double amount) {
        return 30 * amount;
    }
}
