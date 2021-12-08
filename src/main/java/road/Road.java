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

    int peopleInTrip() {
        int res = 0;
        for (Vehicle temp : this.vehicles) {
            res += temp.getNumOfOccupiedPlaces();
        }
        return res;
    }

    void addNewVehicle(Vehicle v) {
        this.vehicles.add(v);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}

