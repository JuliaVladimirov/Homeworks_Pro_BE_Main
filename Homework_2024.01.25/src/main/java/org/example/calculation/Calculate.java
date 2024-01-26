package org.example.calculation;

//         1. Напишите утилитный класс, в котором реализованы методы получения среднего значения AVG, максимального MAX и минимального значения MIN из следующих наборов данных:
//
//         пары целых чисел,
//         пары дробных чисел,
//         одного целого и одного дробного числа,
//         массива целых чисел,
//         массива дробных чисел.
//         Используйте механизм перегрузки.

public class Calculate {
    public static void main(String[] args) {

        UtilClass utils = new UtilClass();
        int wholeNumber1 = 56;
        int wholeNumber2 = 32;
        double fractionalNumber1 = 43.6;
        double fractionalNumber2 = 17.4;
        Integer[] wholeNumbersArray = new Integer[]{2, 8, 54, 61, 13, 27, 34};
        Double[] fractionalNumbersArray = new Double[]{2.0, 8.4, 54.6, 61.2, 13.0, 27.8, 34.6};

        System.out.println("--------------------------------перегрузка метода getAverageSum()-----------------------------------------------");

        utils.getAverageSum(wholeNumber1, wholeNumber2);
        utils.getAverageSum(fractionalNumber1, fractionalNumber2);
        utils.getAverageSum(wholeNumber1, fractionalNumber1);
        utils.getAverageSum(wholeNumbersArray);
        utils.getAverageSum(fractionalNumbersArray);

        System.out.println("--------------------------------перегрузка метода getMaxNumber()-----------------------------------------------");

        utils.getMaxNumber(wholeNumber1, wholeNumber2);
        utils.getMaxNumber(fractionalNumber1, fractionalNumber2);
        utils.getMaxNumber(wholeNumber1, fractionalNumber1);
        utils.getMaxNumber(wholeNumbersArray);
        utils.getMaxNumber(fractionalNumbersArray);

        System.out.println("--------------------------------перегрузка метода getMinNumber()-----------------------------------------------");

        utils.getMinNumber(wholeNumber1, wholeNumber2);
        utils.getMinNumber(fractionalNumber1, fractionalNumber2);
        utils.getMinNumber(wholeNumber1, fractionalNumber1);
        utils.getMinNumber(wholeNumbersArray);
        utils.getMinNumber(fractionalNumbersArray);
    }
}