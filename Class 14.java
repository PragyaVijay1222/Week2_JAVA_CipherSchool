// Interface for Animal
interface Animal {
    void eat();
    void sleep();
}

// Interface for Flyable behavior
interface Flyable {
    void fly();
}

// Interface for Swimmable behavior
interface Swimmable {
    void swim();
}

// Class implementing both Flyable and Swimmable interfaces
class Bird implements Animal, Flyable, Swimmable {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
        bird.swim();
    }
}
