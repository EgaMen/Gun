public class Main {

    public static void main(String[] args) {
        Thing []things= ThingsFabric.generate(100, 100,100);
        BackPack backPack = new BackPack(5000,4);
        TaskOne taskOne = new TaskOne();
        taskOne.greedy(backPack,things);
        System.out.println(backPack.toString());
        System.out.print(0);
    }
}


