package org.example.postmailing;

//         2. Есть абстрактный класс ПочтовоеОтправление, в котором представлен набор характеристик:
//
//         наименование;
//         адрес отправителя;
//         адрес получателя;
//         и абстрактное поведение:
//         доставить;
//         отправить;
//         Реализуйте методы этого абстрактного класса в его потомках
//         Письмо, Бандероль, Посылка, Контейнер с учетом той специфики, которая характерна для каждого типа почтовых отправлений на Ваше усмотрение.

public class SendAndDeliver {
    public static void main(String[] args) {

        System.out.println("----------------------------------------Letter-------------------------------------------------------");

        Letter letter1 = new Letter("letter", "Jamie Peter Green, 45 White Oak St., Vincentown, NJ 10018", "Miranda McAnderson, 85 Bradford Lane St., Louisville, KY 79860");
        letter1.informToDeliver();
        letter1.deliver();
        letter1.informToSend();
        letter1.send();

        System.out.println("----------------------------------------Parcel-------------------------------------------------------");

        Parcel parcel1 = new Parcel("parcel", "Jamie Peter Green, 45 White Oak St., Vincentown, NJ 10018", "Miranda McAnderson, 85 Bradford Lane St., Louisville, KY 79860");
        parcel1.informToDeliver();
        parcel1.deliver();
        parcel1.informToSend();
        parcel1.send();

        System.out.println("----------------------------------------Package-------------------------------------------------------");

        Package package1 = new Package("package", "Jamie Peter Green, 45 White Oak St., Vincentown, NJ 10018", "Miranda McAnderson, 85 Bradford Lane St., Louisville, KY 79860");
        package1.informToDeliver();
        package1.deliver();
        package1.informToSend();
        package1.send();

        System.out.println("----------------------------------------Container-------------------------------------------------------");

        Container container1 = new Container("container", "Jamie Peter Green, 45 White Oak St., Vincentown, NJ 10018", "Miranda McAnderson, 85 Bradford Lane St., Louisville, KY 79860");
        container1.informToDeliver();
        container1.deliver();
        container1.informToSend();
        container1.send();
    }
}
