package org.example.homework_2024_01_23.translator;

//        1) Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
//        Реализовать данный класс и создать несколько классов различных переводчиков с одного языка на другой.
//        Например с английского на русский, с русского на немецки и т.п.
//        Продумайте какова архитектура наследования будет в данном приложении.

public class CreateTranslator {
    public static void main(String[] args) {

        English_Spanish translator1 = new English_Spanish("John Smith", 35, "M");
        translator1.canTranslate();
        System.out.println("-------------------------------------------------------------------");

        German_Russian translator2 = new German_Russian("Monica Mustermann", 28, "F");
        translator2.canTranslate();
        System.out.println("-------------------------------------------------------------------");

        French_Italian translator3 = new French_Italian("Colette Laurent", 42, "F");
        translator3.canTranslate();
        System.out.println("-------------------------------------------------------------------");
    }
}