package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}