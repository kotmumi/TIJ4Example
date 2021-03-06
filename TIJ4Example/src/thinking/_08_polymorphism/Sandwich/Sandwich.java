package thinking._08_polymorphism.Sandwich;

//: polymorphism/Sandwich.java
// Order of constructor calls.

import static net.mindview.util.Print.*;

class Meal {
	public Meal() {
		print("Meal()");
	}
}

class Bread {
	public Bread() {
		print("Bread()");
	}
}

class Cheese {
	public Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	public Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	public Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	public PortableLunch() {
		print("PortableLunch()");
	}
}

public class Sandwich {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwich() {
		print("Sandwich()");
	}
} /* Output
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
