package factory.builders;

import factory.buildings.HospitalBuilding;

public class SensataGroup implements Builders{
    @Override
    public HospitalBuilding buildBuildings() {
        return new HospitalBuilding(20, 300, 400, 5);
    }
}
