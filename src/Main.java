import abstract_factory.car.Car;
import abstract_factory.factory.BMWYamahaFactory;
import abstract_factory.factory.PorcheHondaFactory;
import abstract_factory.factory.VechicleFactory;
import abstract_factory.morotcycle.Motorcycle;
import factory.builders.BiGroup;
import factory.builders.Builders;
import factory.builders.SensataGroup;
import factory.buildings.Buildings;

public class Main {
    public static void main(String[] args) {

        //Builder pattern
//        final HouseBuilder builder = new HouseBuilder();
//        HouseDirector.woodHouse(builder);
//        final House woodHouse = builder.result();
//
//        final HouseBuilder builder2 = new HouseBuilder();
//        HouseDirector.stoneHouse(builder2);
//        final House stoneHouse = builder2.result();
//
//        System.out.println(woodHouse);
//        System.out.println(stoneHouse);


        //Factory method pattern
//        Buildings buildings;
//
//        final Builders biGroup = new BiGroup();
//        buildings = biGroup.buildBuildings();
//
//        final Builders sensataGroup = new SensataGroup();
//        buildings = sensataGroup.buildBuildings();
//
//        System.out.println(buildings);


        //Abstract factory method pattern
//        Car car;
//        Motorcycle motorcycle;
//
//        final VechicleFactory BmwYamahaFactory = new BMWYamahaFactory();
//        car = BmwYamahaFactory.createCar();
//        motorcycle = BmwYamahaFactory.createMotorcycle();
//
//        final VechicleFactory PorcheHondaFactory = new PorcheHondaFactory();
//        car = PorcheHondaFactory.createCar();
//        motorcycle = PorcheHondaFactory.createMotorcycle();
    }
}