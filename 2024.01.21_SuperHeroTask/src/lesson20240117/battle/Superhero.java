package lesson20240117.battle;

import java.util.Random;

public class Superhero {

    private String name;

    private int health;

    private int force;

    private Protection protection;

    private Weapon weapon;


    private static Superhero[] availableSuperhero;

    static {
        Superhero superhero1 = new Superhero("Jack", 5);
        Superhero superhero2 = new Superhero("Kevin", 4);
        Superhero superhero3 = new Superhero("Zena", 3);
        Superhero superhero4 = new Superhero("Bill", 2);
        Superhero superhero5 = new Superhero("Harry", 1);
        availableSuperhero = new Superhero[]{superhero1, superhero2, superhero3, superhero4, superhero5};
    }

    public Superhero(String name, int force) {
        this.name = name;
        this.health = 100;
        this.force = force;
        this.protection = Protection.generateRandomProtection();
        this.weapon = Weapon.generateRandomWeapon();

    }

    public static Superhero generateRandomSuperhero() {
        Random random = new Random();
        int r = random.nextInt(availableSuperhero.length);
        return availableSuperhero[r];
    }

   public static void fight(Superhero superhero1,Superhero superhero2 ){

       int hero1CommonForce = superhero1.force + superhero1.weapon.getForce();
       int hero2CommonForce = superhero2.force + superhero2.weapon.getForce();

       double hero1Health = superhero1.health - (double) (hero1CommonForce - hero2CommonForce) / superhero1.protection.getLevel();
       double hero2Health = superhero2.health - (double) (hero2CommonForce - hero1CommonForce) / superhero2.protection.getLevel();

       System.out.println(superhero1.name + "'s health level = " + hero1Health);
       System.out.println(superhero2.name + "'s health level = " + hero2Health);
       System.out.println("---------------------------------------------------");

       if (hero1Health > hero2Health){
           System.out.println(superhero1.name + " won the fight.");
       } else if (hero1Health < hero2Health) {
           System.out.println(superhero1.name + " won the fight.");
       } else {
           System.out.println("Nobody won the fight.");
       }
   }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        if (force < 0) throw new RuntimeException("Force cannot be less than 0");
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero = '" + name + '\'' +
                ", health = " + health +
                ", force = " + force +
                ", protection = " + protection +
                ", weapon = " + weapon;
    }
}
