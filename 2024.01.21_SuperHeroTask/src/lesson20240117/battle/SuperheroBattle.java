
// Superhero battle
//
//Superhero class:
//- name String
//- health int
//- force int
//- Weapon class: - name String
//			    - force int
//- Protection class: - name String
//				    - level int
//
//методы:
//- static generateRandomSuperHero()
//- fight()  ----> health =  health - (force1 - force2) / level
//
//
//1. Создать 3 класса Superhero, Weapon, Protection
//2. Создать несколько персонажей SuperheroBattle main()
//3. Реализовать методы generateRandomSuperHero(), fight()
//fight(Superhero another)
//fight(Superhero one, Superhero second)
//
//4. Продемонстрировать сражение между случайными персонажами

package lesson20240117.battle;

public class SuperheroBattle {

    public static void main(String[] args) {

        Superhero superhero1 = Superhero.generateRandomSuperhero();
        Superhero superhero2 = Superhero.generateRandomSuperhero();

        System.out.println("Today are fighting:");
        System.out.println(superhero1);
        Superhero.introduce(superhero1);
        String message1 = "May the Force be with you!";
        Superhero.introduceSpecial (superhero1, message1);

        System.out.println(superhero2);
        Superhero.introduce(superhero2);
        String message2 = "Shazam!";
        Superhero.introduceSpecial (superhero2, message2);
        System.out.println("--------------------------------------------");

        Superhero.fight(superhero1, superhero2);
        System.out.println("--------------------------------------------");

        Weapon weapon3 = Weapon.generateRandomWeapon();
        Protection protection3 = Protection.generateRandomProtection();
        Superhero superhero3 = new Superhero("Conan", 5, protection3, weapon3);


        Weapon weapon4 = Weapon.generateRandomWeapon();
        Protection protection4 = Protection.generateRandomProtection();
        Superhero superhero4 = new Superhero("Zena", 3, protection4, weapon4);

        System.out.println("Today are fighting:");
        System.out.println(superhero3);
        Superhero.introduce(superhero3);
        String message3 = " I am vengeance!";
        Superhero.introduceSpecial (superhero3, message3);

        System.out.println(superhero4);
        Superhero.introduce(superhero4);
        String message4 = " May the best hero win!";
        Superhero.introduceSpecial (superhero4, message4);
        System.out.println("--------------------------------------------");

        superhero3.fight(superhero4);
        System.out.println("--------------------------------------------");

        Wizard wizard1 = new Wizard("Albus", 3, "Sim sala bim");
        Wizard wizard2 = new Wizard("Merlin", 5, "Alakazam");


        wizard1.introduce(wizard1);
        wizard1.introduceSpecial(wizard1);
        wizard1.heal(superhero3);
        wizard1.increaseForce(superhero3);
        System.out.println("--------------------------------------------");

        wizard2.introduce(wizard2);
        wizard2.introduceSpecial(wizard2);
        Superhero[] superheroesArray = new Superhero[]{superhero1, superhero2, superhero3, superhero4};
        wizard2.heal(superheroesArray);
        wizard2.increaseForce(superheroesArray);


    }
}
