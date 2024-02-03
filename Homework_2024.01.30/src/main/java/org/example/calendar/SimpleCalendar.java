package org.example.calendar;

//Создайте класса Enum для хранения перечня месяцев в году.
//Кроме константных значений, в нем должен также сохраняться русское наименование месяца.
//Напишите метод, который будет рекомендовать вам режим питания, в зависимости от текущего месяца и сезона года.


public class SimpleCalendar {
    public static void main(String[] args) {
        Months month1 = Months.JANUARY;
        Months month2 = Months.FEBRUARY;
        Months month3 = Months.MARCH;
        Months month4 = Months.APRIL;
        Months month5 = Months.MAY;
        Months month6 = Months.JUNE;
        Months month7 = Months.JULY;
        Months month8 = Months.AUGUST;
        Months month9 = Months.SEPTEMBER;
        Months month10 = Months.OCTOBER;
        Months month11 = Months.NOVEMBER;
        Months month12 = Months.DECEMBER;

        System.out.println(month1);
        System.out.println(month6);
        System.out.println(month12);
        System.out.println("----------------------------------------------------------------------------------");


        month1.drinkRight();
        month4.drinkRight();
        month7.drinkRight();
        month10.drinkRight();
        System.out.println("----------------------------------------------------------------------------------");

        month1.eatRight();
        month2.eatRight();
        month3.eatRight();
        month4.eatRight();
        month5.eatRight();
        month6.eatRight();
        month7.eatRight();
        month8.eatRight();
        month9.eatRight();
        month10.eatRight();
        month11.eatRight();
        month12.eatRight();

    }
}