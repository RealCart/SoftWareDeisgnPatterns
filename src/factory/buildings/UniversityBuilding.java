package factory.buildings;

public class UniversityBuilding extends Buildings{
    public UniversityBuilding(int floors, int width, int height, int floorsHeight) {
        super(floors, width, height, floorsHeight);
    }

    @Override
    public String toString() {
        return "UniversityBuilding{" +
                "floors=" + floors +
                ", width=" + width +
                ", height=" + height +
                ", floorsHeight=" + floorsHeight +
                '}';
    }
}
