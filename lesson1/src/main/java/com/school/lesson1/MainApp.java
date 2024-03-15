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
        methodB();
        System.out.println("Task 6");
        methodC();
        System.out.println("Task 7");
        methodD();
        System.out.println("Task 8");
        methodE();
        System.out.println("Task 9");
        int year = 2000;
        System.out.println(isLeapYear(year));
        System.out.println("Task 10");
        methodF();
        System.out.println("Task 11");
        methodG();
        System.out.println("Task 12");
        /*methodH();*/
        System.out.println("Task 13");
        methodI();
        System.out.println("Task 14");
        int[] myArray = methodJ(5, 4);
        for (int i : myArray) {
            System.out.println(i);
        }
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

    static void methodB() {
        int a = 4;
        int b = 6;
        boolean c = (a + b) > 10 && (a + b) <= 20;
        System.out.println(c);
    }

    static void methodC() {
        int a = -1;
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    static void methodD() {
        int a = 100;
        boolean b = (a > 0);
        System.out.println(b);
    }

    static void methodE() {
        int a = 0;
        while (a < 10) {
            System.out.println(a + ".Hello!");
            a++;
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    static void methodF() {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    static void methodG() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    static void methodI() {
        int counter = 10;
        int[][] table = new int[counter][counter];
        for (int i = 0; i < counter; i++) {
            table[i][i] = 1;
        }
        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] methodJ(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }
}