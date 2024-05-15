package org.example.homework_2024_03_14;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
//WrongLoginException - пользовательский класс исключения с конструкторами:
//1) один по умолчанию;
//2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.