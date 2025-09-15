package builder;

public interface IHouseBuilder {
    IHouseBuilder setHeight(double height);
    IHouseBuilder setWidth(double width);
    IHouseBuilder setWindows(int windowCount);
    IHouseBuilder setWalls(int wallsCount);
    IHouseBuilder setMaterial(HouseMaterials material);
    House result();
}
