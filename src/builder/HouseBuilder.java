package builder;

public class HouseBuilder implements IHouseBuilder{
    private double height;
    private double width;
    private int windowsCount;
    private int wallsCount;
    private HouseMaterials material;

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setWindows(int windowCount) {
        this.windowsCount = windowCount;
    }

    @Override
    public void setWalls(int wallsCount) {
        this.wallsCount = wallsCount;
    }

    @Override
    public void setMaterial(HouseMaterials material) {
        this.material = material;
    }

    @Override
    public House result() {
        return new House(width, height, windowsCount, wallsCount, material);
    }
}
