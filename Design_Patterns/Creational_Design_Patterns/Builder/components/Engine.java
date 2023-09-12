package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean stared;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;

    }
    public void on(){
        this.stared = true;
    }
    public void off(){
        this.stared = false;
    }

    public void go(double mileage){
        if(stared){
            this.mileage += mileage;
        }
        else System.err.println("Cannot go(), you " +
                "must start engin first");
    }

    public boolean engineStatus(){
        return stared;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
