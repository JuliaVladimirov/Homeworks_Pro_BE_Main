package org.example.homework_2024_01_23.house;

public class HouseResident {
    private String name;
    private String whoIs;
    private int age;

    public HouseResident(String name, String whoIs, int age) {
        this.name = name;
        this.whoIs = whoIs;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhoIs() {
        return whoIs;
    }

    public void setWhoIs(String whoIs) {
        this.whoIs = whoIs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
