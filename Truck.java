public class Truck extends Vehicle {
    private int capacity;
    private String bodyType;

    public Truck(String brand, int maxSpeed, int capacity, String bodyType) {
        super(brand, maxSpeed);
        this.capacity = capacity;
        this.bodyType = bodyType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBodyType() {
        return bodyType;
    }
}