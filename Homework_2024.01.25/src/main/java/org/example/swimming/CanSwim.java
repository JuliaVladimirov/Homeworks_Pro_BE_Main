package org.example.swimming;

public class CanSwim {
    public static void main(String[] args) {
        Human human1 = new Human("Bill", 36);
        human1.swim();

        Fish fish1 = new Fish("shark", 700);
        fish1.swim();

        Boat boat1 = new Boat(33);
        boat1.swim();
    }
}
