package abstract_factory.factory;

import abstract_factory.car.PorcheCar;
import abstract_factory.morotcycle.HondaMotorcycle;

public class PorcheHondaFactory implements VechicleFactory {
    @Override
    public PorcheCar createCar() {
        return new PorcheCar();
    }

    @Override
    public HondaMotorcycle createMotorcycle() {
        return new HondaMotorcycle();
    }
}
