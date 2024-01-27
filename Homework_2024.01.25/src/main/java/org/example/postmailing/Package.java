package org.example.postmailing;

public class Package extends PostMailing {

    public Package(String nameOfMailing, String senderAddress, String recipientAddress) {
        super(nameOfMailing, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Your package will be delivered to you by a delivery car.");
    }

    @Override
    public void send() {
        System.out.println("Your package will cost 20 Euro.");
    }
}
