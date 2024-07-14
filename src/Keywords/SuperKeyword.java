package Keywords;

class Parent {
	int num = 100;//Parent class Variable

	void display() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent {
	int num = 200;

	void display() {
		System.out.println("Child class method");
	}

	void accessSuperMethod() {
		super.display(); // Calls the display() method of the Parent class
	}

	void accessSuperVariable() {
		System.out.println(super.num); // Accesses the num variable of the Parent class
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(); // Calls Child class method
		obj.accessSuperMethod(); // Calls Parent class method
		obj.accessSuperVariable(); // Accesses Parent class variable num
	}
}