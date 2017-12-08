import java.util.LinkedList;
import java.util.List;

public class BackPack {
    private int size = 0;
    private List<Thing> things =new LinkedList<>();
    private int maxWeight;
    public BackPack(int maxWeight, int length) {
        this.maxWeight = maxWeight;
    }
    public void add(Thing thing) {
        things.add(thing);
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
}
