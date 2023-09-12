package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Abstract_factory_design_pattern;

public class Intel implements IProcessor{
    private String ProcessorName;
    private int processorCount;
    private int Threds;

    Intel(String ProcessorName, int processorCount, int Threds){
        this.ProcessorName = ProcessorName;
        this.processorCount = processorCount;
        this.Threds = Threds;

    }

    public String getProcessorName() {
        return ProcessorName;
    }

    public int getProcessorCount() {
        return processorCount;
    }

    public int getThreds() {
        return Threds;
    }

    @Override
    public String displayProcessorSpec() {
        return  "Intel "+getProcessorName() + " processor has " + getProcessorCount() +
    " and "+ getThreds()+ " Threds";

    }
}
