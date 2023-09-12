package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.builders;

import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.CarType;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Engine;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.GPSNagvigator;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components.Transmission;


public interface Builder {
    void  setCarType(CarType carType);
    void  setgpsNagvigator(GPSNagvigator gpsNagvigator);
    void  setEngine(Engine engine);
    void  setTransmission(Transmission transmission);

}
