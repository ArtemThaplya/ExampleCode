package generics.cars;

import generics.emums.Transmission;

public class SlowCar extends Car{
    public SlowCar(String model, Transmission transmissionType) {
        this.model = model;
        this.transmissionType = transmissionType;
    }
}
