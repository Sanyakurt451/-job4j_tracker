package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int id;

    private String name;

    public Tracker(String name) {
        this.name = name;
    }

    public Tracker(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Tracker() {
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Tracker first = new Tracker();
        first.printInfo();
        Tracker second = new Tracker("Privet", 20);
        second.printInfo();
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}