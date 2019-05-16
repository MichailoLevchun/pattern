package builder;

public class MitsubishiBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Mitsubishi Lancer");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
