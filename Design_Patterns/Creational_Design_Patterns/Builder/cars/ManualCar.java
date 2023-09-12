package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.cars;

import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.CarType;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Engine;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.GPSNagvigator;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Transmission;

public class ManualCar {
    private final int NumSeat;
    private final CarType carType;
    private final Engine engine;
    private final GPSNagvigator gpsNagvigator;
    private final Transmission transmission;
    private double fuel;

    public ManualCar(int numSeat, CarType carType, Engine engine,
                     GPSNagvigator gpsNagvigator,
                     Transmission transmission,
                     double fuel) {
        NumSeat = numSeat;
        this.carType = carType;
        this.engine = engine;
        this.gpsNagvigator = gpsNagvigator;
        this.transmission = transmission;
        this.fuel = fuel;
    }

    public int getNumSeat() {
        return NumSeat;
    }

    public CarType getCarType() {
        return carType;
    }

    public String CarManual(){
        String info ="";
        info += "Manual Car" +"\n";
        info += "Car Type: "+ getCarType() +"\n";
        info += "Type of car: "+ getCarType() +"\n";
        info += "Count of seats: "+ getNumSeat()+"\n";
        info += "Engin volume -> : "+ engine.getVolume()+ "; mileage ->"+ engine.getMileage() +"\n";
        info += "Transmission: " + transmission + "\n";


        return info;
    }

}
