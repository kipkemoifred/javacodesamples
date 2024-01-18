package tutorials.singleton;

public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        // Check if the instance is null, and create it if needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the singleton class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        // Call a method on the singleton instance
        singleton.showMessage();
    }
}
