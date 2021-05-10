public enum Plane {

    EASYJET(100, 1000),
    JETSTAR(200, 2000),
    QANTAS (300, 3000),
    ETIHAD (400, 4000),
    QATAR (500, 5000);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

}



