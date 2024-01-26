package org.example.postmailing;

public class Parcel extends PostMailing {


    public Parcel(String nameOfMailing, String senderAddress, String recipientAddress) {
        super(nameOfMailing, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("A " + getNameOfMailing() +  " has arrived at your address: " + getRecipientAddress() + ", from: " + getSenderAddress());
        System.out.println("Your parcel will be delivered to you by a postman.");
    }

    @Override
    public void send() {
        System.out.println("You send a " + getNameOfMailing() +  " from your address: " + getRecipientAddress() + " to: " + getSenderAddress());
        System.out.println("Your parcel will cost 10 Euro.");
    }
}
