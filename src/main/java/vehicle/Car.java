package vehicle;

import exceptions.*;
import human_kind.Human;

public class Car extends Vehicle{
    Car(){
        this.setNumOfAvablePlaces(4);
        this.setType("Car");
        this.setId();
    }
}
