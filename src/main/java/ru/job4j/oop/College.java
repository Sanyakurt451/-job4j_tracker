package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student st = freshman;
        Object obj = freshman;
        Object ocar = new Freshman();
        Freshman freshmanFromObject = (Freshman) ocar;
        System.out.println(new Freshman());
        System.out.println(new Object());
        System.out.println(new Student());
    }
}
