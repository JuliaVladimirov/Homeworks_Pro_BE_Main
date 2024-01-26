package org.example.postmailing;

public class Container extends PostMailing{

    public Container(String nameOfMailing, String senderAddress, String recipientAddress) {
        super(nameOfMailing, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("A " + getNameOfMailing() +  " has arrived at your address: " + getRecipientAddress() + ", from: " + getSenderAddress());
        System.out.println("Your container will not be delivered to you. You have to get it yourself.");
    }

    @Override
    public void send() {
        System.out.println("You send a " + getNameOfMailing() +  " from your address: " + getRecipientAddress() + " to: " + getSenderAddress());
        System.out.println("Your container will cost 200 Euro.");
    }
}
