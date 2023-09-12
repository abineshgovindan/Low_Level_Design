package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Singleton.Threadsafe_lazyloading_Singleton;

public class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value){
        this.value = value;

    }
    //The approach taken here is called double-checked locking (DCL)
    public static Singleton getInstance(String value) {

        if(instance != null){
            return instance;
        }
        synchronized (Singleton.class){
            if(instance ==null){
                instance = new Singleton(value);
            }
            return instance;
        }
    }

}
