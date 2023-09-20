package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge;

import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices.Radio;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices.TV;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices.device;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Remotes.AdvanceRemote;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Remotes.BasicRemote;

public class Client {
    public static void main(String[] args) {
        testDevices(new TV());
        testDevices(new Radio());
    }
    public static void testDevices( device Device){
        System.out.println("Test case with basic remote");
        BasicRemote basicRemote = new BasicRemote(Device);
        basicRemote.Enable();
        basicRemote.channelUp();
        basicRemote.volumeDown();
        Device.printStatus();

        System.out.println("Test case with Advance remote");
        AdvanceRemote advanceRemote = new AdvanceRemote(Device);
        advanceRemote.Enable();
        advanceRemote.channelUp();
        advanceRemote.channelUp();
        advanceRemote.mute();
        Device.printStatus();
    }


}
