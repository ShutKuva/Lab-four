package technicalStuff;

import road.Road;
import vehicle.Vehicle;
import human_kind.Human;

public class View {
    public static void displayAllVehiclesOnRoad(Road r){
        for (Vehicle temp : r.getVehicles()){
            System.out.println(temp.toString());
        }
    }

    public static void displayAllPeopleOnRoad(Road r){
        for (Vehicle temp : r.getVehicles()){
            for (Human tempH : temp.getAllPeople()){
                System.out.println(tempH.toString());
            }
        }
    }
}
