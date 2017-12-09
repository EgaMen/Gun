package main.java;

import java.util.*;

public class TaskOne {
    public int bestFitDecreasing(BackPack[] backPack, Thing [] things) {
        Arrays.sort(things, Collections.reverseOrder());
        Thing thing = things[0];
        int i=0;
        for(int j=0; j<things.length;j++) {
            if(backPack[i].getWeight()-things[j].getWeight()>=0) {
                backPack[i].add(things[j]);
            }
            else {
                int index = lowestPossible(backPack, things[j].getWeight(),i);
                if(index>0)
                    backPack[index].add(things[j]);
                else {
                    i++;
                    backPack[i].add(things[j]);
                }

            }


        }
        return i+1;
    }



    private int lowestPossible(BackPack[] backPack, int weight, int length) {
        int index = 0;
        int minWeight = backPack[0].getMaxWeight()-weight;
        for(int i=1; i<length;i++) {
            if(backPack[i].getMaxWeight()-weight<minWeight) {
                minWeight = backPack[i].getMaxWeight() - weight;
                index = i;
            }
        }
        if(minWeight>=0)
            return index;
        else
            return -1;

    }

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
    public void dynamic(BackPack backPack, Thing [] things) {
        int [][] matrix= new int[things.length][backPack.getMaxWeight()];
        for(int i = 1; i<things.length;i++) {
            for(int j=1; j<backPack.getMaxWeight();j++) {
                if(j>=things[i].getWeight())
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i-1][j-things[i].getWeight()]+things[i].getPrice());
                else
                    matrix[i][j]=matrix[i-1][j];
            }
        }
        findAns(backPack,things, matrix, things.length-1, backPack.getMaxWeight()-1);

    }
    private void findAns(BackPack backPack, Thing[]things, int [][] matrix, int i, int j) {
        if(matrix[i][j]==0);
        else if(matrix[i-1][j]==matrix[i][j])
            findAns(backPack,things, matrix, i-1, j);
        else {
            backPack.add(things[i]);
            findAns(backPack, things, matrix, i-1, j-things[i].getWeight());
            //backPack.add(things[i]);
        }

    }


}


