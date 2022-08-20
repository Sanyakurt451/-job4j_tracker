package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 326);
        Book book2 = new Book("Lord of the Rings", 500);
        Book book3 = new Book("Forrest Gump", 300);
        Book book4 = new Book("Harry Potter", 615);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Replace book1 to book3.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }

        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if ("Clean Code".equals(bo.getName())) {
                System.out.println(bo.getName());
            }
        }
    }
}
