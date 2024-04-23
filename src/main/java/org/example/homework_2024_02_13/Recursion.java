package org.example.homework_2024_02_13;

public class Recursion {

    public static int startingPopulation = 10000000;
    public static int totalYears = 10;
    public static int yearlyGrowthPerThousand = (14-8);


    public static void main(String[] args) {
        System.out.println("Population in " + totalYears + " years:  " + (startingPopulation + grow(0, 0)));

//        int g = 0;
//        for (int i = 0; i < totalYears; i++) {
//            int t = (startingPopulation + g)/1000;
//            g += t * (14-8);
//            System.out.println(i + " :    " + g);
//
//        }
//        System.out.println(startingPopulation + g);

    }

    public static int grow(int growth, int currentYear) {
        int t = (startingPopulation + growth) / 1000;
        growth += t * yearlyGrowthPerThousand;
        currentYear++;
        System.out.println(currentYear + " - " + growth);
        if (currentYear < totalYears){
            return grow(growth, currentYear);
        } else {
            return growth;
        }
    }

}
