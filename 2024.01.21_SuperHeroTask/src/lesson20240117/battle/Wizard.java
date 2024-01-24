package lesson20240117.battle;
// 5. Создать класс Wizard - волшебник. Реализовать у волшебника
//- методы heal(Superhero hero), heal(Superhero[] heroes) исцеления раненых персонажей
//- методы increaseForce(Superhero hero), increaseForce(Superhero[] heroes) увеличения силы персонажей.
//Сила увеличивается пропорционально уровню (поле level) волшебника по формуле force * 0.1 * level
// force 10
//level 2
//10 + 10 * 2 * 0.1 = 12

//6. В классы Superhero и Wizard добавить метод introduce(), который выводил бы в консоль тест приветствия персонажа.
//По умолчанию приветствие выводится в виде "Hi, I'm Batman!".
//Однако должна быть возможность каждому персонажу задавать свой особенный текст.
public class Wizard {

    private String name;

    private int magicLevel;

    private String message;

    public Wizard(String name, int magicLevel, String message) {
        this.name = name;
        this.magicLevel = magicLevel;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void introduce (Wizard wizard){
        System.out.println("Hi, I'm " + wizard.getName() + "!");

    }

    public void introduceSpecial (Wizard wizard){
        System.out.println(wizard.getName() + ": " + wizard.getMessage() + "!");
    }

    public void heal(Superhero hero) {
        hero.setHealth(100);
        System.out.println("Now " + hero.getName() + "'s health level is " + hero.getHealth());
    }

    public void heal(Superhero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heal(heroes[i]);
        }
    }

    public void increaseForce(Superhero hero){
        hero.setForce((int)(hero.getForce() + hero.getForce() * this.magicLevel * 0.1));
        System.out.println("Now " + hero.getName() + "'s force is " + hero.getForce());
    }

    public void increaseForce(Superhero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            increaseForce(heroes[i]);
        }
    }
}
