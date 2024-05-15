package org.example.homework_2024_05_14;

// 1 уровень сложности: 1. Представьте, что Вы ревьювите код в классе, который написал Ваш коллега.
//Вас не устраивает реализация некоторых методов в классе, характеристик и есть даже замечания по реализации самого класса.
//Вам нужно создать аннотацию, которой Вы можете пометить вышеуказанные участки кода, указать в ней ФИО ревьювера и написать в ней комментарий, в чем же Вы видите проблему.
//
// 2*. Для первой задачи напишите программу, которая с помощью Reflection API сможет найти все участки кода,
// которые помечены пользовательской аннотацией и выведет информацию в виде списка необходимых доработок в формате:
//Имя метода/класса/характеристики, ФИО ревьювера, Комментарий.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@BadCode(name = "Yulia", comment = "Comment1")
public class SomeBadCodeClass {

    int number;

    @BadCode(name = "Yulia", comment = "Comment2")
    private String word;

    @BadCode(name = "Yulia", comment = "Comment3")
    public void print() {
        System.out.println(word + number);
    }

    public static void main(String[] args) {

        SomeBadCodeClass badClass = new SomeBadCodeClass();

        Class aClass = badClass.getClass();
        if (aClass.isAnnotationPresent(BadCode.class)) {
            System.out.println("Имя класса: " + aClass.getSimpleName());
            BadCode annotation = (BadCode) aClass.getAnnotation(BadCode.class);
            System.out.println("Имя ревьювера: " + annotation.name());
            System.out.println("Комментарий: " + annotation.comment());
        }

        System.out.println();

        Field[] declaredFields = badClass.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(BadCode.class)) {
                System.out.println("Название поля: " + field.getName());
                System.out.println("Имя ревьювера: " + field.getAnnotation(BadCode.class).name());
                System.out.println("Комментарий: " + field.getAnnotation(BadCode.class).comment());
            }
        }

        System.out.println();

        Method[] declaredMethods = badClass.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(BadCode.class)) {
                System.out.println("Название метода: " + method.getName());
                System.out.println("Имя ревьювера: " + method.getAnnotation(BadCode.class).name());
                System.out.println("Комментарий: " + method.getAnnotation(BadCode.class).comment());
            }
        }
    }
}
