package abstract_factory.car;

public class BMWCar extends Car {
    public BMWCar() {
        super("BMW");
    }

    @Override
    public int showFuelVolume() {
        return 220;
    }
}
