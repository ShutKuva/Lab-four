package vehicle;

import human_kind.Fireman;

public class FireTruck extends Car{
    FireTruck(){
        this.setNumOfAvablePlaces(8);
        this.setType("FireTruck");
        this.setId();
        this.setTypeOfHuman((new Fireman()).getClass());
    }
}
