public class Cae extends Vehicle {
    private int numberOfDoors;
    private String transmissionType;

    public Cae(String brand, int maxSpeed, int numberOfDoors, String transmissionType) {
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}