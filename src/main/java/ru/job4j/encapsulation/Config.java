package ru.job4j.encapsulation;

public class Config {
    private String name;
    private static int position;

    public String[] properties;

    public Config(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static void main(String[] args) {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
