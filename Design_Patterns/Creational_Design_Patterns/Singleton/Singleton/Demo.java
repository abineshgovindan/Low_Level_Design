package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Singleton.Singleton;

public class Demo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("A");
        Singleton anotherSingleton = Singleton.getInstance("B");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
