package technicalStuff;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.ArrayList;

import vehicle.*;
import human_kind.*;

public class SomeGenerators {
    public static ArrayList<Vehicle> generateVehicles(int numOfVehicles){
        ArrayList<Vehicle> res = new ArrayList<>();
        Random rand = new Random();
        Vehicle instanse;
        int type;
        int numOfPeople;
        for (int i = 0; i < numOfVehicles; i++){
            type = rand.nextInt(5);
            if (type == 0) {
                instanse = new Car();
            } else if (type == 1){
                instanse = new Bus();
            } else if (type == 2){
                instanse = new Taxi();
            } else if (type == 3){
                instanse = new PoliceCar();
            }else {
                instanse = new FireTruck();
            }
            numOfPeople = rand.nextInt(instanse.getNumOfAvablePlaces())+1;
            instanse.boardNotOneHuman((ArrayList<Human>) generatePeople((Class<? extends Human>) instanse.getTypeOfHuman(), numOfPeople));
            res.add(instanse);
        }
        return res;
    }

    static ArrayList<Human> generatePeople(Class<? extends Human> typeOfHuman, int numOfPeople){
        ArrayList<Human> res  = new ArrayList<>();

        try{
            Constructor<? extends Human> con = typeOfHuman.getConstructor(new Class[]{String.class});
            for (int i = 0; i < numOfPeople; i++){
                res.add(con.newInstance(new Object[]{"h"+(i+1)}));
            }
        } catch (NoSuchMethodException e){
            System.out.println("Don't have such constructor");
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e){
            System.out.println(e.getMessage());
        }

        return res;
    }
}
