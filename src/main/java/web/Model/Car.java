package web.Model;


public class Car {

    private String model;
    private int serialNumber;
    private int maxSpeed;

    public Car() {

    }

    public Car(String model, int serialNumber, int maxSpeed) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car Model = " + model +", serialNumber =" + serialNumber + ", MaxSpeed = " + maxSpeed;
    }
}
