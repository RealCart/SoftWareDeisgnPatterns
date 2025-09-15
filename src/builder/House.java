package builder;

public class House {
    House(HouseBuilder builder) {
        this.width = builder.width;
        this.height = builder.height;
        this.windowsCount = builder.windowsCount;
        this.wallsCount = builder.wallsCount;
        this.material = builder.material;
    }

    public double height;
    public double width;
    public int windowsCount;
    public int wallsCount;
    public HouseMaterials material;

    @Override
    public String toString() {
        return "builder.House{" +
                "height=" + height +
                ", width=" + width +
                ", windowsCount=" + windowsCount +
                ", wallsCount=" + wallsCount +
                ", material='" + material + '\'' +
                '}';
    }
}
