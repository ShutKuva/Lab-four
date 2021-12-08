package vehicle;

import human_kind.Human;

import java.util.ArrayList;

public class Taxi extends Car{
    {
        this.setNumOfAvablePlaces(3);
        this.setType("Taxi");
        this.setId();
    }
    public Taxi(ArrayList<Human> humans){
        this.boardNotOneHuman(humans);
    }
    public Taxi(){

    }
}
