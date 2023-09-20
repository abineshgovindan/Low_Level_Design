package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Remotes;

import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices.device;

public class AdvanceRemote extends BasicRemote{
    public AdvanceRemote(device Device){

        super.Device = Device;
    }
    public void mute(){
        System.out.println("AdvanceRemote: mute");
        Device.setVolume(0);
    }
}
