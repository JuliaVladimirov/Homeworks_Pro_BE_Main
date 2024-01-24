package lesson20240117.battle;

import java.util.Random;

public class Superhero extends CombatCharacter {


    private Protection protection;

    private Weapon weapon;

    private int force;


    public Superhero(String name, String message, Protection protection, Weapon weapon) {
        super(name, message);
        this.protection = protection;
        this.weapon = weapon;
    }

    public Superhero(String name, int force, Protection protection, Weapon weapon) {
        super(name);
        this.health = 100;
        this.force = force;
        this.protection = protection;
        this.weapon = weapon;
    }

    public Superhero(String name, Protection protection, Weapon weapon) {
        super(name);
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

    @Override
    public void introduce() {
        System.out.println(getMessage());
    }


//    public static void fight(Superhero superhero1, Superhero superhero2) {
//
//        int hero1CommonForce = superhero1.force + superhero1.weapon.getForce();
//        int hero2CommonForce = superhero2.force + superhero2.weapon.getForce();
//
//        System.out.println(superhero1.getGetName() + " fights with " + superhero2.getGetName());
//        System.out.println("Before fight:");
//        System.out.println(superhero1.getGetName() + "'s common force = " + hero1CommonForce);
//        System.out.println(superhero2.getGetName() + "'s common force = " + hero2CommonForce);
//
//        if (hero1CommonForce > hero2CommonForce) {
//            System.out.println(superhero1.getGetName() + " won the fight.");
//            superhero2.setHealth(superhero2.health - (hero1CommonForce - hero2CommonForce) / superhero2.protection.getLevel());
//            System.out.println("After fight " + superhero2.getGetName() + "'s health level = " + superhero2.health);
//        } else if (hero1CommonForce < hero2CommonForce) {
//            System.out.println(superhero2.getGetName() + " won the fight.");
//            superhero1.setHealth(superhero1.health - (hero2CommonForce - hero1CommonForce) / superhero1.protection.getLevel());
//            System.out.println("After fight " + superhero1.getGetName() + "'s health level = " + superhero1.health);
//        } else {
//            System.out.println("Nobody won the fight.");
//        }
//    }


        public int getForce () {
            return force;
        }

        public void setForce ( int force){
            if (force < 0) throw new RuntimeException("Force cannot be less than 0");
            this.force = force;
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

