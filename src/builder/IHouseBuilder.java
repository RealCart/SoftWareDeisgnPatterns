package builder;

public interface IHouseBuilder {
    void setHeight(double height);
    void setWidth(double width);
    void setWindows(int windowCount);
    void setWalls(int wallsCount);
    void setMaterial(HouseMaterials material);
    House result();
}
