package singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("Singleton is created");
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public static void sayHello() {
        System.out.println(singleton.getClass() + " says hello");
    }
}
