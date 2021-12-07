package vehicle;

import exceptions.*;
import human_kind.Human;
import java.util.Random;
import java.util.ArrayList;

public abstract class Vehicle {
    private ArrayList<Human> allPeople = new ArrayList<>();
    private int numOfOccupiedPlaces;
    private int numOfAvablePlaces;
    private String type;
    private Class<?> typeOfHuman = (new Human()).getClass();
    private String id;

    public void boarding(Human human) throws OverloadException, WrongTypeOfHumanException, AlreadyInVehicle {
        if (this.getNumOfOccupiedPlaces() >= this.getNumOfAvablePlaces()){
            throw new OverloadException(this);
        } else {
            if (human.getType().equals(this.typeOfHuman)){
                if (this.allPeople.contains(human)){
                    throw new AlreadyInVehicle(human);
                } else {
                    this.incrementNumOfOccupiedPlaces();
                    this.boardOnePeople(human);
                }
            } else {
                throw new WrongTypeOfHumanException(this, human);
            }
        }
    }
    public void unBoarding(Human human) throws NoExistingPersonException, NoExistingPeopleException {
        if (this.getNumOfOccupiedPlaces() <= 0){
            throw new NoExistingPeopleException(this);
        }else {
            if (this.getAllPeople().contains(human)){
                this.getAllPeople().remove(human);
                this.decrementNumOfOccupiedPlaces();
            } else {
                throw new NoExistingPersonException(human);
            }
        }
    }

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
    public Class<?> getTypeOfHuman() {
        return this.typeOfHuman;
    }
    public int getNumOfOccupiedPlaces() {
        return this.numOfOccupiedPlaces;
    }
    public String getId() {
        return this.id;
    }
    public ArrayList<Human> getAllPeople() {
        return allPeople;
    }

    void setNumOfAvablePlaces(int numOfPlaces) {
        this.numOfAvablePlaces = numOfPlaces;
    }
    protected void setType(String type) {
        this.type = type;
    }
    protected void setTypeOfHuman(Class<?> typeOfHuman) {
        this.typeOfHuman = typeOfHuman;
    }
    protected void incrementNumOfOccupiedPlaces() {
        this.numOfOccupiedPlaces++;
    }
    protected void decrementNumOfOccupiedPlaces() {
        this.numOfOccupiedPlaces--;
    }
    protected void setId() {
        this.id = generateId(this);
    }
    protected void setAllPeople(ArrayList<Human> allPeople) {
        this.allPeople = allPeople;
    };
    private void boardOnePeople(Human human){
        this.allPeople.add(human);
    }

    @Override
    public String toString(){
        return this.id;
    }
}
