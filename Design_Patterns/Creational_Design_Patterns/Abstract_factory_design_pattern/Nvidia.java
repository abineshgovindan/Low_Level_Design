package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Abstract_factory_design_pattern;

public class Nvidia implements GPU{
    private String GpuName;
    private  int Vram;

    Nvidia(String GpuName, int Vram){
        this.GpuName = GpuName;
        this.Vram = Vram;
    }

    public String getGpuName() {
        return GpuName;
    }

    public int getVram() {
        return Vram;
    }

    @Override
    public String displayGpuSpec() {
        return "Nvidia "+ getGpuName() +" With "+ getVram();
    }
}
