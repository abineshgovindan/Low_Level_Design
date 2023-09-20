package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Remotes;

import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices.device;

public class BasicRemote implements remote{
    protected device Device;
    public BasicRemote(){

    };
    public BasicRemote(device Device){
        this.Device = Device;
    }
    @Override
    public void Enable() {
        if(Device.isEnabled()){

            Device.disable();
        }else {
            Device.enable();
        }
    }



    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        Device.setVolume(Device.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        Device.setVolume(Device.getVolume() - 10);

    }

    @Override
    public void channelUp() {
        System.out.println("Remote: Channel up");
        Device.setChannal(Device.getChannal() +1);

    }

    @Override
    public void channelDown() {
        System.out.println("Remote: Channel Down");
        Device.setChannal(Device.getChannal() -1);

    }
}
