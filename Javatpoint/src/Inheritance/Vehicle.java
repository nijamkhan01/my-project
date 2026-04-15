package Inheritance;

class Engine {
	void start() {
		System.out.println("vehicle started.");
	}

	void stop() {
		System.out.println("vehicle stopped.");
	}
}

	class Car extends Engine {
		void run() {
			System.out.println("car can run");
		}
	}
class Vehicle{
	public static void main(String[] args) {
		Engine v = new Engine();
		// v.start();
		// v.stop();
		Car c = new Car();
		c.start();
		c.run();
		c.stop();

	}
}

