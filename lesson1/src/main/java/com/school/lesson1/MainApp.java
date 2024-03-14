package com.school.lesson1;
/* My java program */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Task 1");
        printThreeWords();
        System.out.println("Task 2");
        checkSumSign();
        System.out.println("Task 3");
        printColor();
        System.out.println("Task 4");
        compareNumbers();
        System.out.println("Task 5");
        metodB();
        System.out.println("Task 6");
        metodC();
        System.out.println("Task 7");
        metodD();
        System.out.println("Task 8");
        metodE();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100 && value > 0) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 3;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static void metodB() {
        int a = 4;
        int b = 6;
        boolean c = (a + b) > 10 && (a + b) <= 20;
        System.out.println(c);
    }

    static void metodC() {
        int a = -1;
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    static void metodD() {
        int a = 100;
        boolean b = (a > 0);
        System.out.println(b);
    }

    static void metodE() {
        int a = 0;
        while (a < 10) {
            System.out.println(a + ".Hello!");
            a++;
        }
    }
}