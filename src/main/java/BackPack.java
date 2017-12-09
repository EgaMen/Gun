package main.java;

import java.util.LinkedList;
import java.util.List;

public class BackPack {
    private int size = 0;
    private List<Thing> things =new LinkedList<>();
    private int maxWeight;
    private int weight;
    public BackPack(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight=maxWeight;
    }
    public void add(Thing thing) {
        things.add(thing);
        weight-=thing.getWeight();
        size++;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Thing thing:things) {
            stringBuilder.append(thing.toString());
            stringBuilder.append("\n");
        }
        stringBuilder.append("size=");
        stringBuilder.append(size);
        return stringBuilder.toString();
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
}
