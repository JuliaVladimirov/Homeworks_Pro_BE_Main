package lesson20240117.battle;

//6. Добавить абстрактный класс Character. Вынести в него поля name, message, метод introduce().
//        Все персонажи игры должны быть его наследником.
//


public abstract class Character {

    private String getName;

    private String message;

    public Character(String name) {
        this.getName = name;
        this.message = "Hi, I' am " + name;
    }

    public Character(String name, String message) {
        this.getName = name;
        this.message = message;
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract void introduce();


    }
