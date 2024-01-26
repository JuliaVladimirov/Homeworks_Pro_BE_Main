package org.example.postmailing;

public class Letter extends PostMailing{

    public Letter(String nameOfMailing, String senderAddress, String recipientAddress) {
        super(nameOfMailing, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("A " + getNameOfMailing() +  " has arrived at your address: " + getRecipientAddress() + ", from: " + getSenderAddress());
        System.out.println("Your letter will be delivered to your mailbox.");
    }

    @Override
    public void send() {
        System.out.println("You send a " + getNameOfMailing() +  " from your address: " + getRecipientAddress() + " to: " + getSenderAddress());
        System.out.println("Your letter will cost 3 Euro.");
    }
}
