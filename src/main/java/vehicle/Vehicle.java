package vehicle;

import exceptions.*;
import java.util.Random;

public abstract class Vehicle {
    private int numOfOccupiedPlaces;
    private int numOfAvablePlaces;
    private String type;
    private String typeOfHuman;
    private String id;

    abstract void boarding() throws OverloadException;
    abstract void unBoarding() throws NoExistingPersonException, NoExistingPeopleException;

    private static String generateId(Vehicle vehicle){
        Random rand = new Random();
        return vehicle.getType() + rand.nextInt(10000);
    }

    public int getNumOfAvablePlaces() {
        return this.numOfAvablePlaces;
    }
    public String getType() {
        return this.type;
    }
    public String getTypeOfHuman() {
        return this.typeOfHuman;
    }
    public int getNumOfOccupiedPlaces() {
        return this.numOfOccupiedPlaces;
    }
    public String getId() {
        return this.id;
    }

    protected void setNumOfAvablePlaces(int numOfPlaces) {
        this.numOfAvablePlaces = numOfPlaces;
    }
    protected void setType(String type) {
        this.type = type;
    }
    protected void setTypeOfHuman(String typeOfHuman) {
        this.typeOfHuman = typeOfHuman;
    }
    protected void incrementNumOfOccupiedPlaces() {
        this.numOfOccupiedPlaces++;
    }
    public void setId() {
        this.id = generateId(this);
    }
}
