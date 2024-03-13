package com.school.lesson1;

public class MainApp3 {
    public static void main(String[] args) {
        printColor();
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
}