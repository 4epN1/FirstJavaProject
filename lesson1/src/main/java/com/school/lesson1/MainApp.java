package com.school.lesson1;
/* My java program */
public class MainApp {
    public static void main(String[] args) {
        /* 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.*/
        System.out.println("Task 1");
        printThreeWords();
        /* 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
        и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать
         эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
         в противном случае - “Сумма отрицательная”;*/
        System.out.println("Task 2");
        checkSumSign();
        /* 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
        Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
        если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
        если больше 100 (100 исключительно) - “Зеленый”;*/
        System.out.println("Task 3");
        printColor();
        /*4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
         и инициализируйте их любыми значениями, которыми захотите.
         Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/
        System.out.println("Task 4");
        compareNumbers();
        /*5. Напишите метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
        System.out.println("Task 5");
        sumIntegers();
        /*6. Напишите метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.*/
        System.out.println("Task 6");
        numberParameters();
        /*7. Напишите метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
        System.out.println("Task 7");
        integerParameter();
        /*8. Напишите метод, которому в качестве аргументов передается строка и число,
         метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
        System.out.println("Task 8");
        numberLines();
        /*9. Напишите метод, который определяет, является ли год високосным,
         и возвращает boolean (високосный - true, не високосный - false).
         Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
        System.out.println("Task 9");
        int year = 2000;
        System.out.println(isLeapYear(year));
        /*10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        System.out.println("Task 10");
        replaceNumbers();
        /*11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/
        System.out.println("Task 11");
        emptyArray();
        /*12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        System.out.println("Task 12");
        multiplyNumbers();
        /*13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
         если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
         индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];*/
        System.out.println("Task 13");
        diagonalElements();
        /*14. Написать метод, принимающий на вход два аргумента: len и initialValue,
        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue. */
        System.out.println("Task 14");
        int[] myArray = twoArguments(5, 4);
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

    static void sumIntegers() {
        int a = 4;
        int b = 6;
        boolean c = (a + b) > 10 && (a + b) <= 20;
        System.out.println(c);
    }

    static void numberParameters() {
        int a = -1;
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    static void integerParameter() {
        int a = 100;
        boolean b = (a > 0);
        System.out.println(b);
    }

    static void numberLines() {
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

    static void  replaceNumbers() {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        for (int value : myArray) {
            System.out.println(value + " ");
        }
    }

    static void emptyArray() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
    }
    static void multiplyNumbers() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
    static void diagonalElements() {
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

    static int[] twoArguments(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }
}