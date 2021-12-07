package vehicle;

import exceptions.OverloadException;
import exceptions.NoExistingPeopleException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import human_kind.Human;

import org.junit.jupiter.api.function.Executable;

public class VehicleTests {
    @Test
    public void testCars(){
        Car car = new Car();
        Human[] allHuman = {
                new Human("first"),
                new Human("second"),
                new Human("third"),
                new Human("fourth"),
                new Human("extra")
        };
        try {
            for (int i = 0; i < allHuman.length; i++) {
                car.boarding(allHuman[i]);
            }
        } catch(OverloadException e){
            System.out.println("How it work?");
        }
        Executable tryToThrowOverload = () -> Assertions.assertThrows(
                OverloadException.class,
                () -> {
                    car.boarding(allHuman[4]);
                });
        Executable tryToPredictNumOfOccupiedPlaces = () -> Assertions.assertEquals(4, car.getNumOfOccupiedPlaces());
        Assertions.assertAll(tryToPredictNumOfOccupiedPlaces, tryToThrowOverload);
    }
    @Test
    public void testCarsUnBoardNonExistingOfPeople(){
        Car car = new Car();
        Human tryer = new Human("Nick");
        Assertions.assertThrows(NoExistingPeopleException.class, () -> {
            car.unBoarding(tryer);
        });
    }
}
