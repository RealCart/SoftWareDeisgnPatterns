package abstract_factory.morotcycle;

public class YamahaMotorcycle extends Motorcycle{
    public YamahaMotorcycle() {
        super("Yamaha");
    }

    @Override
    public int showFuelVolume() {
        return 180;
    }
}
