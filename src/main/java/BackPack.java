package main.java;

import java.util.LinkedList;
import java.util.List;

public class BackPack {
    List<Thing> things =new LinkedList<>();
    private int weight;
    public BackPack(int weight, int length) {
        this.weight=weight;
    }
    public void add(Thing thing) {
        things.add(thing);
    }

    public int getWeight() {
        return weight;
    }
}
