package org.example.calculation;

import java.util.Arrays;

public class UtilClass {

    //--------------------------------перегрузка метода getAverageSum()-----------------------------------------------

    public void getAverageSum(int a, int b) {// целые числа
        int averageSum = (a + b) / 2;
        System.out.println("The average sum of " + a + " and " + b + " is: " + averageSum);
    }
    public void getAverageSum(double a, double b) {// дробные числа
        double averageSum = (a + b) / 2;
        System.out.println("The average sum of " + a + " and " + b + " is: " + averageSum);
    }
    public void getAverageSum(int a, double b) {// целое и дробное число
        double averageSum = (a + b) / 2;
        System.out.println("The average sum of " + a + " and " + b + " is: " + averageSum);
    }
    public void getAverageSum(Integer[] array) {// массив целых чисел
        int averageSum = 0;
        for (int i = 0; i < array.length; i++){
            averageSum = averageSum + array[i];
        }
        averageSum = averageSum / array.length;
        System.out.println("The average sum of " + Arrays.toString(array) + " is: " + averageSum);
    }
    public void getAverageSum(Double[] array) {// массив дробных чисел
        double averageSum = 0;
        for (int i = 0; i < array.length; i++){
            averageSum = averageSum + array[i];
        }
        averageSum = averageSum / array.length;
        System.out.println("The average sum of " + Arrays.toString(array) + " is: " + averageSum);
    }




    //--------------------------------перегрузка метода getMaxNumber()-----------------------------------------------

    public void getMaxNumber(int a, int b) {// целые числа
        if (a > b) {
            System.out.println(a + " is max number.");
        } else {
            System.out.println(b + " is max number.");
        }
    }
    public void getMaxNumber(double a, double b) {// дробные числа
        if (a > b) {
            System.out.println(a + " is max number.");
        } else {
            System.out.println(b + " is max number.");
        }
    }
    public void getMaxNumber(int a, double b) {// целое и дробное число
        if (a > b) {
            System.out.println(a + " is max number.");
        } else {
            System.out.println(b + " is max number.");
        }
    }
    public void getMaxNumber(Integer[] array) {// массив целых чисел
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++){
            if (maxNum < array[i]){
                maxNum = array[i];
            }
        }
        System.out.println(maxNum + " is max number.");
    }
    public void getMaxNumber(Double[] array) {// массив дробных чисел
        double maxNum = array[0];
        for (int i = 1; i < array.length; i++){
            if (maxNum < array[i]){
                maxNum = array[i];
            }
        }
        System.out.println(maxNum + " is max number.");
    }



    //--------------------------------перегрузка метода getMinNumber()-----------------------------------------------

    public void getMinNumber(int a, int b) {// целые числа
        if (a < b) {
            System.out.println(a + " is min number.");
        } else {
            System.out.println(b + " is min number.");
        }
    }
    public void getMinNumber(double a, double b) {// дробные числа
        if (a < b) {
            System.out.println(a + " is min number.");
        } else {
            System.out.println(b + " is min number.");
        }
    }
    public void getMinNumber(int a, double b) {// целое и дробное число
        if (a < b) {
            System.out.println(a + " is min number.");
        } else {
            System.out.println(b + " is min number.");
        }
    }
    public void getMinNumber(Integer[] array) {// массив целых чисел
        int minNum = array[0];
        for (int i = 1; i < array.length; i++){
            if (minNum > array[i]){
                minNum = array[i];
            }
        }
        System.out.println(minNum + " is min number.");
    }
    public void getMinNumber(Double[] array) {// массив дробных чисел
        double minNum = array[0];
        for (int i = 1; i < array.length; i++){
            if (minNum > array[i]){
                minNum = array[i];
            }
        }
        System.out.println(minNum + " is min number.");
    }
}
