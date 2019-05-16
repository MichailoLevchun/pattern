package abstractFactory.factory;

import abstractFactory.model.Car;
import abstractFactory.model.Motorcycle;

public interface VehicleFactory {

    Car createCar();

    Motorcycle createMotorcycle();
}






