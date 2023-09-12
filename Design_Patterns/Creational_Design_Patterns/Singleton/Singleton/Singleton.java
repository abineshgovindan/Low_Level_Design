package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Singleton.Singleton;

public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
