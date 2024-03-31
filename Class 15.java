// Class with different access modifiers
public class MyClass {
    // Public variable
    public int publicVar = 10;

    // Private variable
    private int privateVar = 20;

    // Protected variable
    protected int protectedVar = 30;

    // Default (package-private) variable
    int defaultVar = 40;

    // Public method
    public void publicMethod() {
        System.out.println("Public method called");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method called");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("Default method called");
    }
}

// Another class in the same package
class AnotherClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Accessing public members
        System.out.println("Public variable: " + obj.publicVar);
        obj.publicMethod();

        // Cannot access private members outside the class
        // System.out.println("Private variable: " + obj.privateVar);
        // obj.privateMethod();

        // Accessing protected members within the same package
        System.out.println("Protected variable: " + obj.protectedVar);
        obj.protectedMethod();

        // Accessing default members within the same package
        System.out.println("Default variable: " + obj.defaultVar);
        obj.defaultMethod();
    }
}
