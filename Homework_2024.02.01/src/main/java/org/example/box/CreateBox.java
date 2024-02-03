package org.example.box;

public class CreateBox {
    public static void main(String[] args) {

        BoxInteger boxInteger1 = new BoxInteger(18, 34, 34);
        boxInteger1.fitTheBox(15,30,28);
        boxInteger1.fitTheBox(20,35,20);

        System.out.println("-------------------------------------------------------------------");

        BoxDouble boxDouble1 = new BoxDouble(21.0, 43.0, 35.0);
        boxDouble1.fitTheBox(20.0,41.56,34.99);
        boxDouble1.fitTheBox(22.35,37.89, 26.99);

        System.out.println("-------------------------------------------------------------------");

        BoxString boxString1 = new BoxString("21", "39", "27");
        boxString1.fitTheBox("18", "37", "25");
        boxString1.fitTheBox("23", "57", "27");
    }
}
//       2. У вас есть на почте коробка, у которой есть 3 характеристики: высота, длина и ширина.
//       В коробку вы можете положить любой объект (главное чтобы он влез по габаритам) и его отправить по почте или получить по почте.
//       Как Вы думаете, можем ли мы использовать для создания данного класса Generic подход? Если да, попробуйте реализовать данный класс.
