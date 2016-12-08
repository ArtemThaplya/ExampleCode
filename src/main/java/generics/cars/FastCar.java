package generics.cars;

import generics.emums.Transmission;

public class FastCar extends Car {
    public FastCar(String model, Transmission transmissionType) {
        this.model = model;
        this.transmissionType = transmissionType;
    }
}
