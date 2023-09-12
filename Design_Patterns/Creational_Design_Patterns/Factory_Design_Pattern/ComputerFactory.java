package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Factory_Design_Pattern;

public class ComputerFactory implements IComputerFactory {


     public static Computer getComputer(String ComputerType, String ComputerUserName, int Ram, int HDD) {
        if(ComputerType.equalsIgnoreCase("Gaming")) return new GamingComputer(ComputerUserName, Ram, HDD);
        else if(ComputerType.equalsIgnoreCase("OfficeComputer")) return new OfficeComputer(ComputerUserName, Ram, HDD);
        return null;
    }
}
