package exceptions;

import vehicle.Vehicle;
import human_kind.Human;

public class WrongTypeOfHumanException extends Exception{
    public WrongTypeOfHumanException(Vehicle vehicle, Human human){
        super(vehicle.getType() + " can not take people with type " + human.getType());
    }
}
