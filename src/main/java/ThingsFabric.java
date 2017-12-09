package main.java;

import java.util.Random;

public class ThingsFabric {

    public static Thing[] generate(int quality, int weight, int price) {
        Random random = new Random();
        Thing[] things = new Thing[quality];
        for(int i=0;i<quality;i++) {
            things[i]=new Thing(Integer.toString(i),random.nextInt(weight), random.nextInt(price));
        }
        return things;
    }


}
