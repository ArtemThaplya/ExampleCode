package generics;

import generics.cars.Car;
import generics.emums.Transmission;
import generics.interfaces.Validator;


public class CarValidator implements Validator<Car> {

    @Override
    public boolean isValid(Car car) {

        return (car.getMaxSpeedKmh() >= 200 && car.getTransmissionType() == Transmission.AT);
    }
}
