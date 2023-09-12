package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Abstract_factory_design_pattern;

public class AMD implements IProcessor {
    private String ProcessorName;
    private int processorCount;
    private int Threds;

    AMD(String ProcessorName, int processorCount, int Threds){
        this.ProcessorName = ProcessorName;
        this.processorCount = processorCount;
        this.Threds = Threds;
    }

    @Override
    public String getProcessorName() {
        return ProcessorName;
    }

    @Override
    public int getProcessorCount() {
        return processorCount;
    }

    @Override
    public int getThreds() {
        return Threds;
    }

    @Override
    public String displayProcessorSpec() {
        return "AMD " + getProcessorName() + " processor has " + getProcessorCount() +
                " and "+ getThreds()+ " Threds";

    }


}
