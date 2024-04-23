package org.example.homework_2024_01_23.auto;
//        3) Есть класс Авто со своим набором характеристик и поведения.
//        Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику, а какие простому Водителю.
//        Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ к методам класса Авто.

public class CreateAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Ford", "diesel", 4, "white", 100, "107.7");
        AutoMechanic mechanic1 = auto1;
        System.out.println("The auto-mechanic fixes the " + mechanic1.getEngineType() + " engine, changes " + mechanic1.getNumOfWheels() + " wheels and colors the auto in " + mechanic1.getColor() + ".");
        Driver driver1 = auto1;
        System.out.println("The driver drives " + driver1.getAutoName() + " with speed of " + driver1.getAverageSpeed() + " km/h and listens to the " + driver1.getRadioFrequency() + " radio.");

        System.out.println("----------------------------------------------------------------------------------------------------");

        Auto auto2 = new Auto("Fiat", "benzine", 4, "red", 80, "98.1");
        AutoMechanic mechanic2 = auto2;
        System.out.println("The auto-mechanic fixes the " + mechanic2.getEngineType() + " engine, changes " + mechanic2.getNumOfWheels() + " wheels and colors the auto in " + mechanic2.getColor() + ".");
        Driver driver2 = auto2;
        System.out.println("The driver drives " + driver2.getAutoName() + " with speed of " + driver2.getAverageSpeed() + " km/h and listens to the " + driver2.getRadioFrequency() + " radio.");
    }


}
