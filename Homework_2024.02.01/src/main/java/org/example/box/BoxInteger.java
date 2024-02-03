package org.example.box;

public class BoxInteger extends Box<Integer> implements BoxInterface<Integer> {


    public BoxInteger(Integer height, Integer length, Integer width) {
        super(height, length, width);
    }

    @Override
    public void fitTheBox(Integer height, Integer length, Integer width) {
        if (height < super.getHEIGHT() && length < super.getLENGTH() && width < super.getWIDTH()) {
            System.out.println("Your object fits the box. You can sen your package.");
        } else {
            System.out.println("Your object does not fit the box. Sorry.");
        }
    }
}
