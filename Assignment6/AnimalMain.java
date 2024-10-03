package assignment6;
//Abstract class Animal
abstract class Animal {
 // Abstract methods to be implemented by subclasses
 public abstract void sound();
 public abstract void move();
}

//Concrete subclass Dog
class Dog extends Animal {

 @Override
 public void sound() {
     System.out.println("Dog barks: Woof! Woof!");
 }

 @Override
 public void move() {
     System.out.println("Dog runs on four legs.");
 }
}

//Concrete subclass Cat
class Cat extends Animal {

 @Override
 public void sound() {
     System.out.println("Cat meows: Meow! Meow!");
 }

 @Override
 public void move() {
     System.out.println("Cat walks and jumps silently.");
 }
}

//Concrete subclass Bird
class Bird extends Animal {

 @Override
 public void sound() {
     System.out.println("Bird chirps: Chirp! Chirp!");
 }

 @Override
 public void move() {
     System.out.println("Bird flies in the sky.");
 }
}

//Main class to test the Animal hierarchy
public class AnimalMain {

 public static void main(String[] args) {
     // Create instances of Dog, Cat, and Bird
     Animal dog = new Dog();
     Animal cat = new Cat();
     Animal bird = new Bird();

     // Test Dog
     System.out.println("Dog:");
     dog.sound();
     dog.move();

     // Test Cat
     System.out.println("\nCat:");
     cat.sound();
     cat.move();

     // Test Bird
     System.out.println("\nBird:");
     bird.sound();
     bird.move();
 }
}
