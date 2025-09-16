package abstract_factory.factory;

import abstract_factory.car.Car;
import abstract_factory.morotcycle.Motorcycle;

public interface VechicleFactory {
    public Car createCar();
    public Motorcycle createMotorcycle();
}
