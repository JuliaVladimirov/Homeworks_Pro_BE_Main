package org.example.homework_2024_01_23.translator;

public class German_Russian extends Translator{

    public German_Russian(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void canTranslate() {
        System.out.println("Translator: " + this.getName() + ", age: " + this.getAge() + ", gender:" + this.getGender());
        System.out.println(this.getName() + " can translate from German to Russian and vice versa.");
    }
}
