package generics.cars;

import generics.emums.Transmission;

public class AverageCar extends Car {
    public AverageCar(String model, Transmission transmissionType) {
        this.model = model;
        this.transmissionType = transmissionType;
    }
}
