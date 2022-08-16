package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int f) {
        return sum(f) + minus(f) + divide(f) + multiply(f);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int result1 = calculator.minus(1);
        System.out.println(result1);
        int result2 = calculator.divide(5);
        System.out.println(result2);
        int result4 = calculator.sumAllOperation(result);
        System.out.println(result4);
    }
}
