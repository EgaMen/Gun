package test.java;

import main.java.BackPack;
import main.java.TaskOne;
import main.java.Thing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {
    @Test
    void greedy_Default_True() {
        Thing[]things= ThingsFabric();
        BackPack backPack = new BackPack(9);
        TaskOne taskOne = new TaskOne();
        taskOne.greedy(backPack,things);
        assertEquals(backPack.getMaxPrise(),10);
        //System.out.println(backPack.toString());
    }

    @Test
    void dynamic_Default_True() {
        Thing[]things= ThingsFabric();
        BackPack backPack = new BackPack(13);
        TaskOne taskOne = new TaskOne();
        taskOne.dynamic(backPack,things);
        System.out.println(backPack.toString());
        assertEquals(backPack.getSize(),2);
       // System.out.println(backPack.toString());
    }

    @Test
    void bestFitDecreasing_Default_True() {
        Thing[]things= ThingsFabric();
        BackPack[] backPack = baskPackFabric();
        TaskOne taskOne = new TaskOne();
        int length=taskOne.bestFitDecreasing(backPack, things);
        //System.out.println(backPack.toString());
        assertEquals(length,4);
        // System.out.println(backPack.toString());
    }
    @Test
    void greedyMP_Default_True() {
        Thing[]things= ThingsFabric();
        BackPack[] backPack = new BackPack[2];
        for(int i=0;i<backPack.length;i++)
            backPack[i]=new BackPack(9);
        TaskOne taskOne = new TaskOne();
        taskOne.greedyMP(backPack, things);
        //System.out.println(backPack.toString());
        int cost=0;
        for(BackPack x:backPack)
            cost+=x.getMaxPrise();

        assertEquals(cost,17);
        // System.out.println(backPack.toString());

    }



    private Thing[] ThingsFabric() {
        Thing[] things = new Thing[5];
        things[0]=new Thing("a",3,1);
        things[1]=new Thing("a",4,6);
        things[2]=new Thing("a",5,4);
        things[3]=new Thing("a",8,7);
        things[4]=new Thing("a",9,6);
        return things;

    }

    private BackPack[] baskPackFabric() {
        BackPack[] backPack = new BackPack[10];
        for(int i=0;i<backPack.length;i++)
            backPack[i]=new BackPack(9);
        return backPack;

    }


}




