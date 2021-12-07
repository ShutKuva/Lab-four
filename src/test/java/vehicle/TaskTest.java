package vehicle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import human_kind.*;
import exceptions.*;

public class TaskTest {
    @Test
    public void testVehiclesOnWrongTypesOfHuman(){
        Car car = new Car();
        FireTruck fireTruck= new FireTruck();
        PoliceCar policeCar = new PoliceCar();

        Fireman fireman = new Fireman("Fireman");
        Policeman policeman = new Policeman("Police");
        Human human = new Human("Человек");

        Executable tryCarThrow = () -> Assertions.assertThrows(WrongTypeOfHumanException.class, ()-> car.boarding(policeman));
        Executable tryCarNoThrow = () -> Assertions.assertDoesNotThrow(()->{car.boarding(human);car.unBoarding(human);});

        Executable tryFireThrow = () -> Assertions.assertThrows(WrongTypeOfHumanException.class, ()-> fireTruck.boarding(human));
        Executable tryFireNoThrow = () -> Assertions.assertDoesNotThrow(()->{fireTruck.boarding(fireman);fireTruck.unBoarding(fireman);});

        Executable tryPoliceThrow = () -> Assertions.assertThrows(WrongTypeOfHumanException.class, ()-> policeCar.boarding(human));
        Executable tryPoliceNoThrow = () -> Assertions.assertDoesNotThrow(()->{policeCar.boarding(policeman);policeCar.unBoarding(policeman);});

        Assertions.assertAll(tryCarThrow, tryCarNoThrow, tryFireThrow, tryFireNoThrow, tryPoliceThrow, tryPoliceNoThrow);
    }
}
