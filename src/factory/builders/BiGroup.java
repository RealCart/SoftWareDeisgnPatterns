package factory.builders;

import factory.buildings.UniversityBuilding;

public class BiGroup implements Builders{
    @Override
    public UniversityBuilding buildBuildings() {
        return new UniversityBuilding(
                6,
                300,
                5000,
                20
        );
    }
}
