package vehicle;

import human_kind.Human;
import java.util.ArrayList;

public class Car extends Vehicle{
    {
        this.setNumOfAvablePlaces(4);
        this.setType("Car");
        this.setId();
    }
    public Car(ArrayList<Human> humans){
        this.boardNotOneHuman(humans);
    }
    public Car(){

    }
}
