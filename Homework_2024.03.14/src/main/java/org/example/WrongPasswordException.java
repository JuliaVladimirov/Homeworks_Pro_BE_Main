package org.example;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
//WrongPasswordException - пользовательский класс исключения с конструкторами:
//1) один по умолчанию;
//2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.