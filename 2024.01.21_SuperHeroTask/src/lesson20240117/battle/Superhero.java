package lesson20240117.battle;

import java.util.Random;

public class Superhero {

    private String name;

    private int health;

    private int force;

    private Protection protection;

    private Weapon weapon;



    public Superhero(String name, int force, Protection protection, Weapon weapon) {
        this.name = name;
        this.health = 100;
        this.force = force;
        this.protection = protection;
        this.weapon = weapon;

    }

    public static Superhero generateRandomSuperhero() {
        Random random = new Random();
        Weapon weapon = Weapon.generateRandomWeapon();
        Protection protection = Protection.generateRandomProtection();
        String[] names = {"Batman", "Superman", "Spider-man", "Ironman", "Wonder woman", "Captain America", "Hulk"};
        return new Superhero(names[random.nextInt(names.length)], random.nextInt(5), protection, weapon);
    }

    public static void introduce (Superhero hero){
        System.out.println("Hi, I'm " + hero.getName() + "!");
    }

    public static void introduceSpecial (Superhero hero, String message){
                System.out.println(hero.getName() + ": " + message + "!");
    }
    public static void fight(Superhero superhero1, Superhero superhero2) {

        int hero1CommonForce = superhero1.force + superhero1.weapon.getForce();
        int hero2CommonForce = superhero2.force + superhero2.weapon.getForce();

        System.out.println(superhero1.name + " fights with " + superhero2.name);
        System.out.println("Before fight:");
        System.out.println(superhero1.name + "'s common force = " + hero1CommonForce);
        System.out.println(superhero2.name + "'s common force = " + hero2CommonForce);

        if (hero1CommonForce > hero2CommonForce) {
            System.out.println(superhero1.name + " won the fight.");
            superhero2.setHealth(superhero2.health - (hero1CommonForce - hero2CommonForce) / superhero2.protection.getLevel());
            System.out.println("After fight " + superhero2.name + "'s health level = " + superhero2.health);
        } else if (hero1CommonForce < hero2CommonForce) {
            System.out.println(superhero2.name + " won the fight.");
            superhero1.setHealth(superhero1.health - (hero2CommonForce - hero1CommonForce) / superhero1.protection.getLevel());
            System.out.println("After fight " + superhero1.name + "'s health level = " + superhero1.health);
        } else {
            System.out.println("Nobody won the fight.");
        }
    }

    public void fight(Superhero another) {

        System.out.println(this.name + " fights with " + another.name);

        int myForce = this.force + this.weapon.getForce();
        int anotherForce = another.force + another.weapon.getForce();

        System.out.println("Before fight:");
        System.out.println(this.name + "'s common force = " + myForce);
        System.out.println(another.name + "'s common force = " + anotherForce);

        if (myForce < anotherForce) {
            System.out.println(this.name + " loses");
            this.health = this.health - (anotherForce - myForce) / this.protection.getLevel();
            System.out.println("After fight " + this.name + "'s health level = " + this.health);
        } else if (myForce > anotherForce) {
            System.out.println(another.name + " loses");
            another.health = another.health - (myForce - anotherForce) / another.protection.getLevel();
            System.out.println("After fight " + another.name + "'s health level = " + another.health);
        } else {
            System.out.println("No one wins. Powers are equal");
        }
    }


        public int getForce () {
            return force;
        }

        public void setForce ( int force){
            if (force < 0) throw new RuntimeException("Force cannot be less than 0");
            this.force = force;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getHealth () {
            return health;
        }

        public void setHealth ( int health){
            this.health = health;
        }

        public Protection getProtection () {
            return protection;
        }

        public void setProtection (Protection protection){
            this.protection = protection;
        }

        public Weapon getWeapon () {
            return weapon;
        }

        public void setWeapon (Weapon weapon){
            this.weapon = weapon;
        }



    @Override
        public String toString () {
            return "Hero = '" + name + '\'' +
                    ", health = " + health +
                    ", force = " + force +
                    ", protection = " + protection +
                    ", weapon = " + weapon;
        }
    }

