import java.util.Map;
import java.util.TreeMap;

public class TaskOne {

    public void greedy(BackPack backPack, Thing [] things) {
        Map<Float,Thing> unitCost = new TreeMap< Float, Thing>();
        for (Thing thing : things) {
            unitCost.put(1/((float) thing.getPrice() / (float) thing.getWeight()), thing);
        }
       /* int weight=backPack.getMaxWeight();
        while((weight)>0) {
            Thing thing=
        }*/
        int maxWeight=backPack.getMaxWeight();
        for(Float key : unitCost.keySet()) {
            Thing thing=unitCost.get(key);
            if((maxWeight-thing.getWeight()>=0)) {
                maxWeight-=thing.getWeight();
                backPack.add(thing);
            }
            if(maxWeight==0)
                break;
        }
    }
    public void dynamic() {


    }

}


