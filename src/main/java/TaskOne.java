package main.java;


import java.util.Map;
import java.util.TreeMap;

public class TaskOne {

    public void greedy(BackPack backPack, Thing [] things) {
        Map<Float,Thing> unitCost = new TreeMap< Float, Thing>();
        for (Thing thing : things) {
            unitCost.put((float) thing.getPrice() / (float) thing.getWeight(), thing);
        }
       /* int weight=backPack.getWeight();
        while((weight)>0) {
            Thing thing=
        }*/
        int weight=backPack.getWeight();
        for(Float key : unitCost.keySet()) {
            Thing thing=unitCost.get(key);
            if((weight-thing.getWeight()>=0)) {
                backPack.add(thing);
            }
            if(weight==0)
                break;
        }
    }
    public void dynamic() {

    }

}


