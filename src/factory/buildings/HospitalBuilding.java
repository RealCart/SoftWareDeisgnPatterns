package factory.buildings;


public class HospitalBuilding extends  Buildings{
    public HospitalBuilding(int floors, int width, int height, int floorsHeight) {
        super(floors, width, height, floorsHeight);
    }

    @Override
    public String toString() {
        return "HospitalBuilding{" +
                "floorsHeight=" + floorsHeight +
                ", height=" + height +
                ", width=" + width +
                ", floors=" + floors +
                '}';
    }
}
