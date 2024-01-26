package org.example.swimming;

import java.sql.SQLOutput;

public class Human implements Swim{

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + ", " + age + " year old, can swim freestyle.");// freestyle style - плавание вольным стилем
    }
}
