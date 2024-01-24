package lesson20240117.battle;
//        7. Добавить абстрактный класс CombatCharacter. Вынести в него поле health.
//        Добавить в него следующие методы
//        - public abstract int countForce();
//        - public abstract int countProtectionLevel();
//        - public void fight(CombatCharacter another)
//        Все сражающиеся персонажи игры должны быть его наследником.


public abstract class CombatCharacter extends Character {

    private int health;

    public CombatCharacter(String name) {
        super(name);
        this.health = 100;
    }

    public CombatCharacter(String name, String message) {
        super(name, message);
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int countForce();


    public abstract int countProtectionLevel();

    public void fight(CombatCharacter another){
                   System.out.println(this.getGetName() + " fights with " + another.getGetName());
        int myForce = countForce();
        int anotherForce = another.countForce();
        if (myForce < anotherForce) {
                System.out.println(another.getGetName() + " wins");
                this.health = this.health - (anotherForce - myForce) / this.countProtectionLevel();
            } else if (myForce > anotherForce) {
                System.out.println(this.getGetName() + " wins");
                another.health = another.health - (myForce - anotherForce) / another.countProtectionLevel();
            } else {
                System.out.println("No one wins. Powers are equal");
            }
        }
}

