package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Factory_Design_Pattern;

public class GamingComputer extends Computer {
    private String ComputerUserName;
    private int Ram;
    private int HDD;



    GamingComputer(String ComputerUserName, int Ram, int HDD) {
        this.ComputerUserName = ComputerUserName;
        this.Ram = Ram;
        this.HDD = HDD;
    }


    @Override
    public String getComputerUserName() {
        return this.ComputerUserName;
    }

    @Override
    public int getRam() {
        return this.Ram;
    }

    @Override
    public int getHDD() {
        return this.HDD;
    }

    @Override
    public void DisplaySpec() {
        System.out.println("This is a Gaming pc "+getComputerUserName() + "is ordered Computer" +
                "with "+ getRam()+"GB Ram and "+ getHDD()+ "GB hard disk With");

    }
}
