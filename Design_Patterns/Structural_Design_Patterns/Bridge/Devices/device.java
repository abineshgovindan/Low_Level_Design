package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Bridge.Devices;

public interface device {
    boolean isEnabled();
    void enable();
    void disable();
    int  getVolume();
    void setVolume(int percent);

    int getChannal();
    void setChannal(int channal);
    void printStatus();

}
