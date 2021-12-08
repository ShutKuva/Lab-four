package road;

import java.util.ArrayList;

import human_kind.*;
import vehicle.*;
import technicalStuff.*;

public class MainRoad {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = SomeGenerators.generateVehicles(5);
        Road mainRoad = new Road(vehicles);
        View.displayAllVehiclesOnRoad(mainRoad);
        System.out.println();
        System.out.println(mainRoad.peopleInTrip());
        View.displayAllPeopleOnRoad(mainRoad);
        System.out.println();
        Bus bus = new Bus();
        mainRoad.addNewVehicle(bus);
        View.displayAllVehiclesOnRoad(mainRoad);
        System.out.println();
        View.displayAllPeopleOnRoad(mainRoad);
    }
}