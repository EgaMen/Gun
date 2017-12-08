public class Thing {
    private String name;
    private int weight;
    private int price;

    public Thing(String name,int weight, int price) {
        this.weight = weight;
        this.price=price;
        this.name=name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name=");
        stringBuilder.append(name);
        stringBuilder.append("\n");
        stringBuilder.append("weight=");
        stringBuilder.append(weight);
        stringBuilder.append("\n");
        stringBuilder.append("price=");
        stringBuilder.append(price);
        stringBuilder.append("\n");
        return stringBuilder.toString();
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
