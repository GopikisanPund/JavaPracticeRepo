package Opps;

interface I1 {
	abstract public void iMethod();
}

interface I2 {
	abstract void iMethod_2();

	public static void nonStaticMethod() {

		System.out.println("This is one interface nonStaticMethod");
	}
}

class TestInterface implements I1, I2 {
	public void iMethod() {
		System.out.println("Interface Method");
	}

	public void iMethod_2() {
		System.out.println("This is also interface Method");

	}
}

public class Interface {

	public static void main(String[] args) {
	
		TestInterface interface1 = new TestInterface();
		interface1.iMethod();
		interface1.iMethod_2();
		
		//if you want access non abstact method from interface directtly call nonstatic method
		I2.nonStaticMethod();

	}

}
