package generics;

import generics.cars.AverageCar;
import generics.cars.Car;
import generics.cars.FastCar;
import generics.cars.SlowCar;
import generics.interfaces.Task;


public class CarTask implements Task<Car> {

    private Car car;

    public CarTask(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        if (car instanceof SlowCar){
            car.setMaxSpeedKmh(150);
        }
        else if (car instanceof AverageCar){
            car.setMaxSpeedKmh(200);
        }
        else if (car instanceof FastCar){
            car.setMaxSpeedKmh(250);
        }
    }

    @Override
    public Car getResult() {
        return car;
    }
}