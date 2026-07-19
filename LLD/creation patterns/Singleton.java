/**
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
 * 
 * create the private constructor
 * static creation method that returns cached object
 * public accessor
 */

public class Singleton{
    // LAZY initialization
    private static Singleton instance;
    private Singlelton() {

    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singlelton();
        }
        return instance;
    }
}
/**
 * Basic Lazy
 * Synchronized
 * Double Checked Locking
 * Holder Pattern
 * Eager
 * Enum
 */