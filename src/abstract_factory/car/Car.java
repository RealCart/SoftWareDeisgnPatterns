package abstract_factory.car;

import abstract_factory.Vechicle;

public abstract class Car implements Vechicle {
    Car(String name) {
        this.brandName = name;
    }

    String brandName;

    protected Car() {
    }

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
