package lesson20240117.battle;

import java.util.Random;

public class Weapon {

    private String name;

    private int force;

    private static Weapon[] availableWeapon;

    static {
        Weapon weapon1 = new Weapon("Gun", 5);
        Weapon weapon2 = new Weapon("Axe", 4);
        Weapon weapon3 = new Weapon("Sword", 3);
        Weapon weapon4 = new Weapon("Knife", 2);
        Weapon weapon5 = new Weapon("Prayer", 1);
        availableWeapon = new Weapon[]{weapon1, weapon2, weapon3, weapon4, weapon5};
    }

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public static Weapon generateRandomWeapon() {
        Random random = new Random();
        int r = random.nextInt(availableWeapon.length);
        return availableWeapon[r];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Weapon {" +
                "name = '" + name + '\'' +
                ", force = " + force +
                '}';
    }

}
