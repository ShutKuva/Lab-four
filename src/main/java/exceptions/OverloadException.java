package exceptions;

import vehicle.Vehicle;

public class OverloadException extends Exception{
    public OverloadException(Vehicle transport){
        super("No more places in " + transport.getId());
    }
}
