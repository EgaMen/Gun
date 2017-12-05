package main.java;

public class Thing {
    private String name;
    private int weight;
    private int price;

    public Thing(String name,int weight, int price) {
        this.weight = weight;
        this.price=price;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
