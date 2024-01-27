package org.example.postmailing;

public abstract class PostMailing {

    private String nameOfMailing;
    private String senderAddress;
    private String recipientAddress;


    public PostMailing() {
    }

    public PostMailing(String nameOfMailing, String senderAddress, String recipientAddress) {
        this.nameOfMailing = nameOfMailing;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }

    public String getNameOfMailing() {
        return nameOfMailing;
    }

    public void setNameOfMailing(String nameOfMailing) {
        this.nameOfMailing = nameOfMailing;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

public void informToDeliver (){
    System.out.println("A " + getNameOfMailing() +  " has arrived at your address: " + getRecipientAddress() + ", from: " + getSenderAddress());
}
    public void informToSend (){
        System.out.println("You send a " + getNameOfMailing() +  " from your address: " + getRecipientAddress() + " to: " + getSenderAddress());
    }

    public abstract void deliver();

    public abstract void send();
}
