
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

        System.out.println(superhero1);
        System.out.println(superhero2);
        System.out.println("--------------------------------------------");

        Superhero.fight(superhero1,superhero2);


    }


}
