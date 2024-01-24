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
public class Wizard extends Character {


    private int magicLevel;


    public Wizard(String name, int magicLevel) {
        super(name);
        this.magicLevel = magicLevel;
    }

    public Wizard(String name, String message, int magicLevel) {
        super(name, message);
        this.magicLevel = magicLevel;
    }
    @Override
    public void introduce() {
        System.out.println(getMessage());
    }



    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }



        public void heal(Superhero hero) {
        if (hero.getHealth() == 100){
            System.out.println(hero.getHealth() + "is healthy. Nothing to heal.");
        } else {
            hero.setHealth(100);
            System.out.println("Now " + hero.getGetName() + "'s health level is healed.");
        }

    }

    public void heal(Superhero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heal(heroes[i]);
        }
    }

    public void increaseForce(Superhero hero){
        hero.setForce((int)(hero.getForce() + hero.getForce() * this.magicLevel * 0.1));
        System.out.println("Now " + hero.getGetName() + "'s force is " + hero.getForce());
    }

    public void increaseForce(Superhero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            increaseForce(heroes[i]);
        }
    }
}
