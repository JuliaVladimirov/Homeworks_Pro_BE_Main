package org.example.concert;

public class Artist<T> {

    private String name;
    private T talent;

    public Artist(String name, T talent) {
        this.name = name;
        this.talent = talent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getTalent() {
        return talent;
    }

    public void setTalent(T talent) {
        this.talent = talent;
    }

    public void perform() {
        System.out.println("Now on the scene: ");
        System.out.println(name + ": He/she is " + talent + ".");
    }
}
