package road;

import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private List<Vehicle> vehicles = new ArrayList<>();

    Road(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    Road() {

    }

    static int peopleInTrip(Road r) {
        int res = 0;
        for (Vehicle temp : r.vehicles) {
            res += temp.getNumOfOccupiedPlaces();
        }
        return res;
    }

    static void addNewVehicle(Road r, Vehicle v) {
        r.vehicles.add(v);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}

