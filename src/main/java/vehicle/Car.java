package vehicle;

import exceptions.*;

public class Car extends Vehicle{
    Car(){
        this.setNumOfAvablePlaces(4);
        this.setType("Car");
        this.setId();
    }

    @Override
    public void boarding() throws OverloadException {
        if (this.getNumOfOccupiedPlaces() == this.getNumOfAvablePlaces()){
            throw new OverloadException(this);
        } else {
            this.incrementNumOfOccupiedPlaces();
        }
    }
    @Override
    public void unBoarding() throws NoExistingPersonException, NoExistingPeopleException {
        if (this.getNumOfOccupiedPlaces() == 0){
            throw new NoExistingPeopleException(this);
        }else {

        }
    }
}
