package org.example.box;

public class BoxString extends Box<String> implements BoxInterface<String> {


     public BoxString(String height, String length, String width) {
          super(height, length, width);
               }

     @Override
     public void fitTheBox(String height, String length, String width) {
          int digitalHeight = Integer.parseInt(height);
          int digitalLength = Integer.parseInt(length);
          int digitalWidth = Integer.parseInt(width);
          int digitalHEIGHT = Integer.parseInt(super.getHEIGHT());
          int digitalLENGTH = Integer.parseInt(super.getLENGTH());
          int digitalWIDTH = Integer.parseInt(super.getWIDTH());

          if (digitalHeight < digitalHEIGHT && digitalLength < digitalLENGTH && digitalWidth < digitalWIDTH) {
               System.out.println("Your object fits the box. You can send your package.");
          } else {
               System.out.println("Your object does not fit the box. Sorry.");
          }
     }
}
