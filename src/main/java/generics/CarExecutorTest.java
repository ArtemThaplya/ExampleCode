package generics;

import generics.cars.AverageCar;
import generics.cars.FastCar;
import generics.cars.SlowCar;
import generics.emums.Transmission;
import generics.interfaces.Excecutor;
import org.junit.Test;


public class CarExecutorTest {
    @Test
    public void test(){

        Excecutor carExecutor = new CarExecutor();

        carExecutor.addTask(new CarTask(new SlowCar("VAZ", Transmission.MT)));
        carExecutor.addTask(new CarTask(new AverageCar("Subaru", Transmission.AT)));
        carExecutor.addTask(new CarTask(new FastCar("Ferrari", Transmission.MT)));

        carExecutor.addTask(new CarTask(new SlowCar("OKA", Transmission.MT)), new CarValidator());
        carExecutor.addTask(new CarTask(new SlowCar("FIAT", Transmission.AT)), new CarValidator());
        carExecutor.addTask(new CarTask(new AverageCar("FORD", Transmission.MT)), new CarValidator());
        carExecutor.addTask(new CarTask(new AverageCar("SUZUKI", Transmission.AT)), new CarValidator());
        carExecutor.addTask(new CarTask(new FastCar("Bugatti", Transmission.MT)), new CarValidator());

        carExecutor.execute();

        System.out.println("Valid results:");
        for (Object car : carExecutor.getValidResults()){
            System.out.println(car.toString());
        }

        System.out.println("Invalid results:");
        for (Object car : carExecutor.getInvalidResults()){
            System.out.println(car.toString());
        }

    }
}
