package vehicle;

import human_kind.Human;
import human_kind.Policeman;

import java.util.ArrayList;

public class PoliceCar extends Car{
    {
        this.setNumOfAvablePlaces(4);
        this.setType("PoliceCar");
        this.setId();
        this.setTypeOfHuman(Policeman.class);
    }
    public PoliceCar(ArrayList<Human> humans){
        this.boardNotOneHuman(humans);
    }
    public PoliceCar(){

    }
}
