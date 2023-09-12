package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Abstract_factory_design_pattern;

public interface LaptopFactory {
    IProcessor ProcessorSpec();
    GPU GPUSpec();
}
