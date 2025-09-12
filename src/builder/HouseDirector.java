package builder;

public class HouseDirector {
    public static void woodHouse(HouseBuilder builder) {
        builder.setWidth(300);
        builder.setHeight(100);
        builder.setWalls(8);
        builder.setMaterial(HouseMaterials.WOOD);
    }

    public static void stoneHouse(HouseBuilder builder) {
        builder.setWidth(100);
        builder.setHeight(150);
        builder.setWalls(4);
        builder.setWindows(3);
        builder.setMaterial(HouseMaterials.STONE);
    }
}
