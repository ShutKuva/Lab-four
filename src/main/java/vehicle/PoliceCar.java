package vehicle;

import human_kind.Policeman;

public class PoliceCar extends Car{
    PoliceCar(){
        this.setNumOfAvablePlaces(4);
        this.setType("PoliceCar");
        this.setId();
        this.setTypeOfHuman((new Policeman()).getClass());
    }
}
