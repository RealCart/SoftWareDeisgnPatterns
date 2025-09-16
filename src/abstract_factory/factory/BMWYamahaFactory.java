package abstract_factory.factory;

import abstract_factory.car.BMWCar;
import abstract_factory.morotcycle.YamahaMotorcycle;

public class BMWYamahaFactory implements VechicleFactory {
    @Override
    public BMWCar createCar() {
        return new BMWCar();
    }

    @Override
    public YamahaMotorcycle createMotorcycle() {
        return new YamahaMotorcycle();
    }
}
