package vehicle;

import human_kind.Human;

import java.util.ArrayList;

public class Bus extends Vehicle{
    {
        this.setNumOfAvablePlaces(4);
        this.setType("Bus");
        this.setId();
    }
    public Bus(ArrayList<Human> humans){
        this.boardNotOneHuman(humans);
    }
    public Bus(){

    }
}
