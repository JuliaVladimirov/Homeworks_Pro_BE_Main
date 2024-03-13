package org.example.part3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks5 {
    public static void main(String[] args) {

//  Поток 3:

//  Задание 1: Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.

        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        Long numOfStrings = list.stream()
                .filter(word -> word.contains("Java"))
                .count();

        System.out.println("Количество строк, которые содержат заданную подстроку:");
        System.out.println(numOfStrings + "\n");

//  Задание 2: Дан список целых чисел. Необходимо найти максимальный элемент списка, который делится на заданное число без остатка.

        List<Integer> listWholeNumbers = Arrays.asList(10, 15, 20, 25, 30);
        Integer maxElem = listWholeNumbers.stream()
                .filter(number -> number % 10 == 0)
                .max(Comparator.naturalOrder()).orElse(0);

        System.out.println("Максимальный элемент списка, который делится на заданное число (10) без остатка:");
        System.out.println(maxElem + "\n");

//  Задание 3: Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
//  Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.

        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 25),
                new Person("Jack", 30),
                new Person("James", 35),
                new Person("Jill", 40));

        Double averageAge = people.stream()
                .filter(name -> name.getName().startsWith("J"))
                .map(Person::getAge)
                .mapToInt(Integer::intValue)
                .summaryStatistics().getAverage();

        System.out.println("Средний возраст людей, чьи имена начинаются на заданную букву (J):");
        System.out.println(averageAge + "\n");

//  Задание 4: Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
//  этой коллекции строк, и вернуть их в виде списка.

        List<String> lines = Arrays.asList(
                "Java is a programming language.",
                "Java is widely used in enterprise applications.",
                "Python is gaining popularity as a data science tool.",
                "Python is a versatile programming language.");

        List<String> uniqueLines = lines.stream()
                .map(word -> word.split("\\W+"))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Уникальные слова в этой коллекции строк в виде списка:");
        System.out.println(uniqueLines + "\n");

//  Задание 5: Подсчитать буквы в нижнем и верхнем регистре

        String word = "KikJhYggfTgf";
        Long countLowerCaseLetters = word.chars()
                .mapToObj(letter -> (char) letter)
                .filter(Character::isLowerCase)
                .count();
        System.out.println("Буквы в нижнем регистре:");
        System.out.println(countLowerCaseLetters + "\n");

        Long countUpperCaseLetters = word.chars()
                .mapToObj(letter -> (char) letter)
                .filter(Character::isUpperCase)
                .count();

        System.out.println("Буквы в верхнем регистре:");
        System.out.println(countUpperCaseLetters + "\n");

//  Задание 6: Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк через Optional

//        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
//             Optional<Map.Entry<Integer, List<String>>> max =


//  Задание 7: Дан список сотрудников, у каждого из которых есть поле "salary".
//  Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer" в компаниях, которые находятся в городах, начинающихся на букву "M".

        List<Employee> employees = Arrays.asList(
                new Employee("Tom", "Miller", 2500, "developer", "Stars Developing", "Memphis"),
                new Employee("Bob", "Miller", 3500, "middle developer", "Stars Developing", "Milwaukee"),
                new Employee("John", "Sour", 3000, "developer", "Stars Developing", "Atlanta"),
                new Employee("Bill", "Dean", 2300, "developer", "Stars Developing", "Memphis"),
                new Employee("Mary", "Smith", 4500, "senior developer", "Stars Developing", "Milwaukee"),
                new Employee("Lucy", "Abrams", 3700, "middle developer", "Stars Developing", "Los Angeles"),
                new Employee("Tina", "Harrison", 4250, "senior developer", "Stars Developing", "Memphis"),
                new Employee("Greg", "Brown", 2800, "developer", "Stars Developing", "Milwaukee"));

        Double averageSalary = employees.stream()
                .filter(employee -> employee.getCity().startsWith("M"))
                .filter(employee -> employee.getJobTitle().equals("developer"))
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue)
                .summaryStatistics().getAverage();

        System.out.println("Средняя зарплата сотрудников на должности 'developer' в городах, начинающихся на букву 'M':");
        System.out.println(averageSalary + "\n");


//  Задание 8: У нас есть список списков numbers, и мы хотим получить все четные числа из этих списков.
//  Мы используем flatMap, чтобы преобразовать каждый внутренний список в поток чисел, а затем фильтруем только четные числа.
//  Результат: Even numbers: [2, 4, 6]..

         List<List<Integer>> numbers = Arrays.asList(
                 Arrays.asList(1, 2),
                 Arrays.asList(3, 4),
                 Arrays.asList(5, 6)
         );
         List<Integer> evenNumbers = numbers.stream()
                 .flatMap(Collection::stream)
                 .filter(num -> num % 2 == 0)
                 .toList();
        System.out.println("Все четные числа из списка списков");
        System.out.println(evenNumbers + "\n");


//  Задание 9: Есть два списка list1 и list2, и мы хотим получить все возможные комбинации сумм чисел из обоих списков.
//  Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
//  затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
//  и наконец, собираем все значения в combinedList.
//  Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> combinedList =  list1.stream()
                .flatMap(i -> list2.stream().map(j -> j + i))
                .distinct()
                .toList();

        System.out.println(combinedList + "\n");






    }


}
