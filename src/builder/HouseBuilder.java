package builder;

public class HouseBuilder implements IHouseBuilder{
    double height;
    double width;
    int windowsCount;
    int wallsCount;
    HouseMaterials material;

    @Override
    public IHouseBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public IHouseBuilder setWidth(double width) {
        this.width = width;
        return this;
    }

    @Override
    public IHouseBuilder setWindows(int windowCount) {
        this.windowsCount = windowCount;
        return this;
    }

    @Override
    public IHouseBuilder setWalls(int wallsCount) {
        this.wallsCount = wallsCount;
        return this;
    }

    @Override
    public IHouseBuilder setMaterial(HouseMaterials material) {
        this.material = material;
        return this;
    }

    @Override
    public House result() {
        return new House(this);
    }
}
