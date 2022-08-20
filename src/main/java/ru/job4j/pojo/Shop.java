package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        for (int index = 0; index < products.length; index++) {
            Product product1 = products[index];
            if (product1 == null) {
                return index;
            }
        }
        return -1;
    }
}





