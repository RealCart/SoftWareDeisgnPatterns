package factory;

public abstract class Buildings {
    public Buildings(int floors, int width, int height, int floorsHeight) {
        this.floors = floors;
        this.width = width;
        this.height = height;
        this.floorsHeight = floorsHeight;
    }

    int floors;
    int width;
    int height;
    int floorsHeight;
}

