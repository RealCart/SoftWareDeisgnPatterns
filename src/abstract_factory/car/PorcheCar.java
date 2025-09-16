package abstract_factory.car;

public class PorcheCar extends Car {
    public PorcheCar() {
        super("Porche");
    }

    @Override
    public int showFuelVolume() {
        return 320;
    }
}
