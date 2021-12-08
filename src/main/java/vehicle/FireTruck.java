package vehicle;

import human_kind.Fireman;
import human_kind.Human;

import java.util.ArrayList;

public class FireTruck extends Car{
    {
        this.setNumOfAvablePlaces(4);
        this.setType("FireTruck");
        this.setId();
        this.setTypeOfHuman(Fireman.class);
    }
    public FireTruck(ArrayList<Human> humans){
        this.boardNotOneHuman(humans);
    }
    public FireTruck(){

    }
}
