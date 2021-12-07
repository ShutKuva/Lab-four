package exceptions;

import human_kind.Human;

public class AlreadyInVehicle extends Exception{
    public AlreadyInVehicle(Human h){
        super(h.getName() + " is already siting");
    }
}
