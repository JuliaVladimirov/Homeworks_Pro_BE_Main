package org.example.homework_2024_01_25.postmailing;

public class Parcel extends PostMailing {


    public Parcel(String nameOfMailing, String senderAddress, String recipientAddress) {
        super(nameOfMailing, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Your parcel will be delivered to you by a postman.");
    }

    @Override
    public void send() {
        System.out.println("Your parcel will cost 10 Euro.");
    }
}
