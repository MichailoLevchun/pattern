package builder;

public class FordBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    void buildTransmission() { car.setTransmission(Transmission.MANUAL); }

    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
