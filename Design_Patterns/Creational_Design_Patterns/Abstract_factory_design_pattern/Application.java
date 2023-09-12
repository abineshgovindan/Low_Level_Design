package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Abstract_factory_design_pattern;

public class Application {
    public static void main(String[] args) {
        MacOS win = new MacOS("AMD", 8 , 16, "RTX4090", 24);
        System.out.println(win.ProcessorSpec().displayProcessorSpec()+ " "+win.GPUSpec().displayGpuSpec());
    }
}
