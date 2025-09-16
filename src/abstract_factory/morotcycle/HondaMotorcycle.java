package abstract_factory.morotcycle;

public class HondaMotorcycle extends Motorcycle{

    public HondaMotorcycle(String brandName) {
        super("Honda");
    }

    public HondaMotorcycle() {
        super("Honda");
    }

    @Override
    public int showFuelVolume() {
        return 175;
    }
}
