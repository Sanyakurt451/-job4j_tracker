package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexander");
        student.setMiddleName(" Andreevich");
        student.setSureName(" Batalov");
        student.setGroup(523);
        student.setDateOfReceipt(2010);

        System.out.println(" Name: " + student.getName() + student.getMiddleName() + student.getSureName()
                + " group: " + student.getGroup() + " date of receipt: " + student.getDateOfReceipt());
    }
}
