import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void first() {
        Scanner myInput = new Scanner( System.in );
        double average = 0;
        double sum = 0;
        int arraySize = 5;
        int[] myArray = new int[arraySize];
        System.out.println("Вывести сумму и средне арифметическое");
        System.out.println("Ввод числа");
        for (int i = 0; i < arraySize; i++) {
            int num = myInput.nextInt();
            myArray[i] = num;
            sum = sum + num;
            if (i == arraySize - 1) {
                average = sum / arraySize;
                System.out.println("Результат:");
                System.out.println(sum);
                System.out.println(average);
            }
        }
        System.out.println("Конец пункта 3");
    }

    public static void second () {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Начала пункта 4");
        int counter = 0;
        int[] myArray;
        int arraySize = 5;
        myArray = new int[arraySize];
        System.out.println("Ввод числа");
        do {
            int num = myInput.nextInt();
            myArray[counter] = num;
            counter = counter + 1;
        } while(counter < arraySize);
        counter = 0;
        int max = myArray[0];
        int min = myArray[0];
        do {
            int val = myArray[counter];
            max = val > max ? val : max;
            min = val < min ? val : min;
            counter = counter + 1;
            if (counter == arraySize) {
                System.out.println(min);
                System.out.println(max);
            }
        } while(counter < arraySize);
        System.out.println("конец пункта 4");
    }

    public static void third(String[] args) {
        System.out.println("Начала пункта 5");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + " " + args[i]);
        }
        System.out.println("Конец 5");
    }

    public static void fourth() {
        double res;
        System.out.println("Начало 6 пункта:");
        for (int i = 1; i <= 10; i++) {
            res = 1. / i;
            System.out.println("Число " + i + " = " + res);
            // System.out.println("Число " + i + " = " + "1" + "/" + i);
        }
        System.out.println("Конец 6 пункта");
    }

    public static void five() {
        Scanner myInput = new Scanner( System.in );
        int num = myInput.nextInt();
        int res = 1;
        int i = 1;
        while(i <= num) {
            res = res * i;
            i = i + 1;
        }
        System.out.println("Факториал числа " + num + " = " + res);
    }

    public static void main(String[] args) {
         first();
        // second();
        // third(args);
        // fourth();
//        five();
    }


}