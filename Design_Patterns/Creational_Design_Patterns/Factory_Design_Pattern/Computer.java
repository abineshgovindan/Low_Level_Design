package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Factory_Design_Pattern;

public  abstract class Computer {




    public abstract String getComputerUserName();
    public abstract int getRam();
    public abstract int getHDD();
    public void DisplaySpec() {
        System.out.println(getComputerUserName() + "is ordered Computer" +
                "with "+ getRam()+"GB Ram and "+ getHDD()+ "GB hard disk With");

    }








}
