package org.example.homework_2024_05_14;

// 1 уровень сложности: 1. Представьте, что Вы ревьювите код в классе, который написал Ваш коллега.
//Вас не устраивает реализация некоторых методов в классе, характеристик и есть даже замечания по реализации самого класса.
//Вам нужно создать аннотацию, которой Вы можете пометить вышеуказанные участки кода, указать в ней ФИО ревьювера и написать в ней комментарий, в чем же Вы видите проблему.
//
// 2*. Для первой задачи напишите программу, которая с помощью Reflection API сможет найти все участки кода,
// которые помечены пользовательской аннотацией и выведет информацию в виде списка необходимых доработок в формате:
//Имя метода/класса/характеристики, ФИО ревьювера, Комментарий.


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface BadCode {

    String name();
    String comment();
}
