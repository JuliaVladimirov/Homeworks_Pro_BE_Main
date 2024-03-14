package org.example;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        String login = "julia_1975";// здесь логин и пароль соответствуют требованиям, но никто не мешает поменять на нелегитимные значения :)))))
        String password = "java4all";
        String confirmPassword = "java4all";

        boolean result = false;
        try {
            result = checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(result);
            System.out.println(e.getMessage());
            exit(1);
        }
        System.out.println(result);
        System.out.println("All ok.");
    }

    public static boolean checkData(String login, String password, String confirmPassword) {// Если не выводить результат этого метода в консоль, то метод можно было сделать void
        if (!login.matches("^[a-zA-Z0-9_]{5,19}$")) {
            throw new WrongLoginException("Login doesn't mach requirements.");
        }
        if (!password.matches("^[a-zA-Z0-9]{5,19}$")){
            throw new WrongPasswordException("Password doesn't mach requirements.");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Confirm Password doesn't mach Password.");
        }
        return true;
    }
}
//Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//
//Login:
//1) Длина login должна быть меньше 20 символов и начинаться с латинской буквы.
//2*) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//
//Password:
//1) Длина password должна быть меньше 20 символов.
//2*) Должен содержать только латинские буквы, цифры.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с конструкторами:
//1) один по умолчанию;
//2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.
//
//Метод возвращает true, если значения верны или false в другом случае.
//Обработка исключений проводится в вызывающем методе.