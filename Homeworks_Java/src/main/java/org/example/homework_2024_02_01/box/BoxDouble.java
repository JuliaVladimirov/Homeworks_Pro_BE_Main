package org.example.homework_2024_02_01.box;

public class BoxDouble extends Box<Double> implements BoxInterface<Double>{
    public BoxDouble(Double height, Double length, Double width) {
        super(height, length, width);
    }

    @Override
    public void fitTheBox(Double height, Double length, Double width) {
        if (height < super.getHEIGHT() && length < super.getLENGTH() && width < super.getWIDTH()) {
            System.out.println("Your object fits the box. You can sen your package.");
        } else {
            System.out.println("Your object does not fit the box. Sorry.");
        }
    }
}
