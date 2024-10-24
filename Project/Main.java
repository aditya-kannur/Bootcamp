package Project;
public class Main{
    public static void main(String[] args){

        Animal dog = new Dog("Dog");
        dog.makeSound();

        Cat cat = new Cat("Cat", "white");
        cat.makeSound();
        cat.getColor();

        // Animal horse = new horse("horse");
        // horse.makeSound();

    }
}


// Abstract class
abstract class Animal{
    private String name;

    // Constructor
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();
}


// Subclass Dog
class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    // Implementing abstract method
    @Override
    public void makeSound(){
        System.out.println( getName() + " says, woof woof");
    }
}

// Subclass Cat
class Cat extends Animal{

    // Encapsulated field
    private String color;

    // Construtor
    public Cat(String name, String color){
        super(name);
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Getter for encapsulated field
    public String getColor(){
        return color;
    }

    // Implementing abstract method
    @Override
    public void makeSound(){
        System.out.println(getName() + " says, meow meow!");
    }
}

