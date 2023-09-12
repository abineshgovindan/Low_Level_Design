package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.builders;

import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.cars.Car;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.CarType;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Engine;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.GPSNagvigator;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Transmission;

public class CarBuilder implements Builder{
    private  int NumSeat;
    private  CarType carType;
    private  Engine engine;
    private  GPSNagvigator gpsNagvigator;
    private  Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setgpsNagvigator(GPSNagvigator gpsNagvigator) {
        this.gpsNagvigator = gpsNagvigator;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine  = engine;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }


    public Car getResult(){
        return new Car(NumSeat, carType,
                engine, gpsNagvigator,
                transmission);
    }
}
