package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices;

public class Radio implements  device{
    private boolean status = false;
    private  int volume =30;
    private  int channel = 1;


    @Override
    public boolean isEnabled() {
        return status;
    }

    @Override
    public void enable() {
        status = true;


    }

    @Override
    public void disable() {
        status= false;
    }

    @Override
    public int  getVolume() {
        return volume;

    }

    @Override
    public void setVolume(int volume) {
        if(volume> 100){
            this.volume =100;
        } else if (volume <0) {
            this.volume =0;
        }else {
            this.volume = volume;
        }

    }

    @Override
    public int getChannal() {
        return channel;
    }

    @Override
    public void setChannal(int channal) {
        if(channal > 100){
            this.channel = channal;
        } else if (channal < 1) {
            channal =1;
        }else {
            this.channel = channal;
        }


    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println(" I'm radio.");
        System.out.println("I'm "+ (this.status ? "Enable" : "Disable") );
        System.out.println("Current volume is -> " + this.volume);
        System.out.println("Current channel is -> "+ this.channel);
    }
}
