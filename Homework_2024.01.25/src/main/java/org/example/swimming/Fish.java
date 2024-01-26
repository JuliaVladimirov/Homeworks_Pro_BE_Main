package org.example.swimming;

public class Fish implements Swim{

    private String name;
    private int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println(name + ", that weighs " + weight + " kg, swims using fins and tail.");// fins and tail - плавники и хвост
    }
}
