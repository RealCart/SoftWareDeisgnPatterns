package factory;

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
