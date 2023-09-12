package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder;

import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.builders.CarBuilder;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.builders.ManualCarBuilder;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.cars.Car;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.cars.ManualCar;
import Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        ManualCarBuilder manualBuilder = new ManualCarBuilder();
        director.constructHatchBack(builder);

        director.constructSport(manualBuilder);

        Car car = builder.getResult();
        ManualCar SportsCar = manualBuilder.getResult();


        car.getGpsNagvigator().setStartPosition("Chennai");
        car.getGpsNagvigator().setDestination("Goa");
        car.getEngine().on();
        System.out.println(car.CarManual());
        System.out.println(SportsCar.CarManual());



    }







}
