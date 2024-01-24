package org.example.translator;

public class French_Italian extends Translator {

    public French_Italian(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    void canTranslate() {
        System.out.println("Translator: " + this.getName() + ", age: " + this.getAge() + ", gender:" + this.getGender());
        System.out.println(this.getName() + " can translate from French to Italian and vice versa.");
    }
}
