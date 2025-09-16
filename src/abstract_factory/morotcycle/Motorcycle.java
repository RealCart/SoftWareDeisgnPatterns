package abstract_factory.morotcycle;

import abstract_factory.Vechicle;

public abstract class Motorcycle implements Vechicle {
    Motorcycle(String brandName) {
        this.brandName = brandName;
    }

    String brandName;

    @Override
    public String startEngine() {
        return "Starting...";
    }

    @Override
    public String ride() {
        return "Riding...";
    }

    @Override
    public int showFuelVolume() {
        return 0;
    }
}
