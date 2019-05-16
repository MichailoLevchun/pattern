package builder;

public class Car {
    private String make;
    private Transmission transmission;
    private int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make = '" + make + '\'' +
                ", transmission = " + transmission +
                ", maxSpeed = " + maxSpeed +
                '}';
    }
}
