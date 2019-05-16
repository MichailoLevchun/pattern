package abstractFactory;

import abstractFactory.factory.MountainVehicleFactory;
import abstractFactory.factory.SportVehicleFactory;
import abstractFactory.factory.VehicleFactory;
import abstractFactory.model.Car;
import abstractFactory.model.Motorcycle;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AbstractFactory {

    public void startAbstractFactoryDemo()  {
        try {
            VehicleFactory sportVehicleFactory = new SportVehicleFactory();
            VehicleFactory mountainVehicleFactory = new MountainVehicleFactory();
            test(mountainVehicleFactory);
            test(sportVehicleFactory);
        }catch (Exception e) {
            e.getStackTrace();
        }
    }

    private void test(VehicleFactory vehicleFactory) {
        Car car = vehicleFactory.createCar();
        car.print();
        Motorcycle motorcycle = vehicleFactory.createMotorcycle();
        motorcycle.print();
    }
}



