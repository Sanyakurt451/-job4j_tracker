package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Item() {
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();
        Item second = new Item("Privet", 20);
        second.printInfo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}