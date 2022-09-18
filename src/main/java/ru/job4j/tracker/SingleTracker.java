package ru.job4j.tracker;

public class SingleTracker {

    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item findByName(String key) {
        return null;
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] delete(int id) {
        return null;
    }

    public Item[] replace(int id, Item item) {
        return null;
    }

    public Item[] indexOf(int id) {
        return null;
    }

}
