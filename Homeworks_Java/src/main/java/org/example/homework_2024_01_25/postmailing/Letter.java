package org.example.homework_2024_01_25.postmailing;

public class Letter extends PostMailing{

    public Letter(String nameOfMailing, String senderAddress, String recipientAddress) {
        super(nameOfMailing, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Your letter will be delivered to your mailbox.");
    }

    @Override
    public void send() {
        System.out.println("Your letter will cost 3 Euro.");
    }
}
