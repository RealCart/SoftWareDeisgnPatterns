package factory;

public class SensataGroup implements Builders{
    @Override
    public HospitalBuilding buildBuildings() {
        return new HospitalBuilding(20, 300, 400, 5);
    }
}
