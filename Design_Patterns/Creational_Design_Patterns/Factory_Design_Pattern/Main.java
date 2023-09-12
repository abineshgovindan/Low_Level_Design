package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Computer GamingPC = ComputerFactory.getComputer("Gaming", " peter ", 16, 512);

        Computer Office = ComputerFactory.getComputer("OfficeComputer", " Joe ", 16, 512);
        GamingPC.DisplaySpec();
        Office.DisplaySpec();
    }
}
