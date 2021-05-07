import java.util.ArrayList;

public class Passenger {

    private static String name;
    private ArrayList<Bag> luggage;

    public Passenger(String name) {
        this.name = name;
        this.luggage = new ArrayList<Bag>();
    }

    public static String getName() {
        return name;
    }

    public void addBag(Bag bag) {
        this.luggage.add(bag);
    }

    public int bagCount() {
        return this.luggage.size();
    }

    public int getTotalWeightOfLuggage() {
        int total = 0;
        for (Bag bag : this.luggage) {
            total += bag.getWeight();
        }
        return total;
    }
}
