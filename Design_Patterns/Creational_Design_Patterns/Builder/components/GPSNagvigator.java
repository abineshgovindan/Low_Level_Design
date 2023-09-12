package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Builder.components;

public class GPSNagvigator {
    private String StartPosition;
    private String Destination;
    public GPSNagvigator(){
        StartPosition = null;
        Destination = null;
    }

    public String getStartPosition() {
        return StartPosition;
    }

    public void setStartPosition(String startPosition ) {
        StartPosition = startPosition;
    }

    public String getDestination( ) {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }
}
