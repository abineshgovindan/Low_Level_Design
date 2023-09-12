package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.cars;

import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.CarType;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Engine;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.GPSNagvigator;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Transmission;

public class Car {
    private final int NumSeat;
    private final CarType carType;
    private final Engine engine;
    private final GPSNagvigator gpsNagvigator;
    private final Transmission transmission;
    private double fuel;

    public Car(int numSeat, CarType carType, Engine engine,
               GPSNagvigator gpsNagvigator,
               Transmission transmission) {
        NumSeat = numSeat;
        this.carType = carType;
        this.engine = engine;
        this.gpsNagvigator = gpsNagvigator;
        this.transmission = transmission;
    }

    public int getNumSeat() {
        return NumSeat;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPSNagvigator getGpsNagvigator() {
        return gpsNagvigator;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String CarManual(){
        String info ="";
        info += "-----------Car------------ " +"\n";
        info += "Type of car: "+ getCarType() +"\n";
        info += "Count of seats: "+ getNumSeat()+"\n";
        info += "Engin volume -> : "+ engine.getVolume()+ "; mileage ->"+ engine.getMileage() +"\n";
        info += "Transmission: " + transmission + "\n";
        if(gpsNagvigator.getStartPosition().equalsIgnoreCase(null)){
            info += "GPS Navigator Start Positions is not set" + "\n";

        }else info += "GPS Navigator Start Positions is "+ gpsNagvigator.getStartPosition() +"\n";
        info += "-----------XxX------------ " +"\n";
        return info;

    }
}
