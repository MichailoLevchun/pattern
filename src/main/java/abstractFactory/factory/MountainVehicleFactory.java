package abstractFactory.factory;

import abstractFactory.model.Car;
import abstractFactory.model.Motorcycle;
import abstractFactory.model.MountainCar;
import abstractFactory.model.MountainMotorcycle;

public class MountainVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new MountainCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MountainMotorcycle();
    }
}


