package ru.job4j.pojo;

public class Student {
    private String name;
    private String middleName;
    private String sureName;
    private int group;
    private int dateOfReceipt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(int dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
