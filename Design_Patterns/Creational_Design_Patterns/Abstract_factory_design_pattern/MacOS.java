package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Abstract_factory_design_pattern;

public class MacOS  implements LaptopFactory{
    private String ProcessorName;
    private int processorCount;
    private int Threds;
    private String GpuName;
    private  int Vram;

    public MacOS(String processorName, int processorCount, int threds, String gpuName, int vram) {
        ProcessorName = processorName;
        this.processorCount = processorCount;
        Threds = threds;
        GpuName = gpuName;
        Vram = vram;
    }
    @Override
    public IProcessor ProcessorSpec() {
        if(this.ProcessorName =="Intel"){
            return new Intel(this.ProcessorName, this.processorCount,
                    this.Threds);

        }else {
            return new Apple(this.ProcessorName, this.processorCount,
                    this.Threds);
        }

    }

    @Override
    public GPU GPUSpec( ) {
        return new Nvidia(this.GpuName, this.Vram);

    }


}
