package exceptions;

import vehicle.Vehicle;

public class NoExistingPeopleException extends Exception{
    public NoExistingPeopleException(Vehicle vehicle){
        super(vehicle.getId() + " has no people");
    }
}
