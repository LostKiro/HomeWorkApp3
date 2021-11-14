package ru.geekbrains.lesson3;


public class MainApp {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int j : arr) System.out.print(j + " ,");
        {
            System.out.println();
            System.out.println();   // это только для того , что бы отделить решение задач внизу после вывода
        }
    }


    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);  // Начало отсчета в конце, после цифры 100
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }
    }
        public static int[] retLenArr (int len, int initialValue) {
            int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initialValue;
            }
            return arr;
        }
    }













