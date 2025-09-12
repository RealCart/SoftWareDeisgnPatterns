package builder;

public class House {
    House(double width, double height, int windowsCount, int wallsCount, HouseMaterials material) {
        this.width = width;
        this.height = height;
        this.windowsCount = windowsCount;
        this.wallsCount = wallsCount;
        this.material = material;
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
