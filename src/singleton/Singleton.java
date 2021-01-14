package singleton;

public class Singleton {

    private String status;
    private static Singleton singleton;
    private Singleton() {
        this.status = "singleton";
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

    public String toString() {
        return "Singleton: " + this.status;
    }

}
