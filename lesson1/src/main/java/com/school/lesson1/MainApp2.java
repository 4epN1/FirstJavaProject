package com.school.lesson1;
public class MainApp2 {
    public static void main(String[] args) {
        checkSumSign();
    }

    static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a + b >= 0)
        {
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }
    }
}
