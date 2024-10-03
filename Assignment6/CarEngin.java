package assignment6;

class Engine {
	 private String engineType;
	 private int horsepower;

	 public Engine(String engineType, int horsepower) {
	     this.engineType = engineType;
	     this.horsepower = horsepower;
	 }

	 public void displayEngineDetails() {
	     System.out.println("Engine Type: " + engineType);
	     System.out.println("Horsepower: " + horsepower + " HP");
	 }

	 public void startEngine() {
	     System.out.println("Engine is starting...");
	 }

	 public void stopEngine() {
	     System.out.println("Engine is stopping...");
	 }
	}

	class Car {
	 private String model;
	 private Engine engine;  

	 public Car(String model, Engine engine) {
	     this.model = model;
	     this.engine = engine;
	 }

	 public void startCar() {
	     System.out.println("Starting the car: " + model);
	     engine.startEngine();
	 }

	 public void stopCar() {
	     System.out.println("Stopping the car: " + model);
	     engine.stopEngine();
	 }
	 public void displayCarDetails() {
	     System.out.println("Car Model: " + model);
	     engine.displayEngineDetails();
	 }
	}

	public class CarEngin {
	 public static void main(String[] args) {
	     Engine engine = new Engine("V8", 400);

	     Car car = new Car("Ford Mustang", engine);

	     car.displayCarDetails();

	     car.startCar();

	     car.stopCar();
	 }
	}