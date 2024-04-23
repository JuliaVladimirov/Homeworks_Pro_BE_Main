package org.example.homework_2024_03_28;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

//  1) реализовать метод, который принимает год и проверяет на високосность

        String year1 = "2010";
        isLeapYear(year1);

        String year2 = "2012";
        isLeapYear(year2);


//  2) вывести на консоль дату, локализованную для Индии (например)

        ZoneId timezone = ZoneId.of("Asia/Kolkata");
        LocalDate todayIndia = LocalDate.now(timezone);
        System.out.println("Сейчас в Индии: " + todayIndia);


//  3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy, dd, D, HH:mm", Locale.ENGLISH);
        LocalDateTime today = LocalDateTime.now();
        String todayString = today.format(formatter);
        System.out.println("Сегодняшняя дата в заданном формате: " + todayString);


//  4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"

        LocalDate myBirthday = LocalDate.of(1975, Month.DECEMBER, 1);
        Locale locale = new Locale("ru");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        String birhtdayString = myBirthday.format(formatter1);
        System.out.println("Дата моего рождения в заданном формате: " + birhtdayString);


//  5) проверить дата "10 Января 1985" - это пятница?

        //Я немножко пофантазировала на эту тему. Хотелось, конечно, сделать универсальный метод, но для этого нужно этот вопрос изучить поглубже, так как в разных языках даты отображаются по-разному.


        String dateRussian = "10 Января 1985";
        String dayRussian = "пятница";
        String dayRussian1 = "четверг";
        String localeRussian = "ru";
        checkDayOfWeek(dateRussian, dayRussian, localeRussian);
        checkDayOfWeek(dateRussian, dayRussian1, localeRussian);

        String dateEnglish = "10 January 1985";
        String dayEnglish = "Friday";
        String dayEnglish1 = "Thursday";
        String localeEnglish = "en";
        checkDayOfWeek(dateEnglish, dayEnglish, localeEnglish);
        checkDayOfWeek(dateEnglish, dayEnglish1, localeEnglish);

        String dateGerman = "10. Januar 1985";
        String dayGerman = "Freitag";
        String dayGerman1 = "Donnerstag";
        String localeGerman = "de";
        checkDayOfWeek(dateGerman, dayGerman, localeGerman);
        checkDayOfWeek(dateGerman, dayGerman1, localeGerman);

        String dateHebrew = "10 ינואר 1985";
        String dayHebrew = "יום שישי";
        String dayHebrew1 = "יום חמישי";
        String localeHebrew = "he";
        checkDayOfWeek(dateHebrew, dayHebrew, localeHebrew);
        checkDayOfWeek(dateHebrew, dayHebrew1, localeHebrew);


//  6) вычесть 10 лет из созданной даты, вывести на консоль

        LocalDate date = LocalDate.of(2024, Month.APRIL, 1);
        System.out.println("Исходная дата: " + date);
        date = date.minusYears(10);
        System.out.println("Полученная дата: " + date);


//  7) получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль

        String string = "2022-12-19T06:55:30.00Z";
        Instant instant = Instant.parse(string);
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());


//  8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль

        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        ZonedDateTime zoneTime = ZonedDateTime.now(zoneId);
        System.out.println(zoneTime);

    }


//  1) реализовать метод, который принимает год и проверяет на високосность
    public static void isLeapYear(String stringYear) {
        String stringDate = stringYear.concat("-01-01");
        LocalDate date = LocalDate.parse(stringDate);
        boolean isLeap = date.isLeapYear();

        if (isLeap) {
            System.out.println(date.getYear() + " високосный год.");
        } else {
            System.out.println(date.getYear() + " не високосный год.");
        }
    }



//  5) проверить дата "10 Января 1985" - это пятница?
    public static void checkDayOfWeek(String date, String dayWeek, String localeString) {
        if (localeString.equals("ru")){
            date = date.toLowerCase();
        }

        if (localeString.equals("de")){
            date = date.replace(".","");
        }

        boolean result = false;

        Locale locale = new Locale(localeString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        LocalDate dateToCheck = LocalDate.parse(date, formatter);

        DayOfWeek dayOfWeek = dateToCheck.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.FULL, locale);

        if (dayWeek.equals(dayOfWeekString)) {
            result = true;
        }

        System.out.println(date + " --> " + dayWeek + "? --> " + result);
    }
}


