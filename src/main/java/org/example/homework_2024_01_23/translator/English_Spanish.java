package org.example.homework_2024_01_23.translator;

public class English_Spanish extends Translator{

    public English_Spanish(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void canTranslate() {
        System.out.println("Translator: " + this.getName() + ", age: " + this.getAge() + ", gender:" + this.getGender());
        System.out.println(this.getName() + " can translate from English to Spanish and vice versa.");
    }
}
