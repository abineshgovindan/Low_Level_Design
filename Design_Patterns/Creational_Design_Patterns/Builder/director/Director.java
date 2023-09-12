package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.director;

import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.builders.Builder;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.CarType;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Engine;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.GPSNagvigator;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Transmission;

public class Director {

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setgpsNagvigator(new GPSNagvigator());
        builder.setEngine(new Engine(2.7, 20));
        builder.setTransmission(Transmission.SIX_4X4);
    }
    public void constructSport(Builder builder){
        builder.setCarType(CarType.SPORTS);
        builder.setgpsNagvigator(new GPSNagvigator());
        builder.setEngine(new Engine(3.0, 10));
        builder.setTransmission(Transmission.AUTO);
    }
    public void constructHatchBack(Builder builder){
        builder.setCarType(CarType.HATCHBACK);
        builder.setgpsNagvigator(new GPSNagvigator());
        builder.setEngine(new Engine(1.5, 25));
        builder.setTransmission(Transmission.AUTO);
    }
    public void constructSedan(Builder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setgpsNagvigator(new GPSNagvigator());
        builder.setEngine(new Engine(2.0, 18));
        builder.setTransmission(Transmission.SEVEN_SPEED);
    }

}
