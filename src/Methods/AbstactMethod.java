package Methods;
/*
 * In simple terms, the main use of abstract methods is to declare a method without providing 
 * its implementation. This allows subclasses to provide their own implementation, 
 * ensuring consistent behavior across different classes while allowing customization as needed.
 */

abstract class Parent {
	abstract void method();

	abstract void Method_2();

	abstract void Method_3();
}

public class AbstactMethod extends Parent {

	public void method() {
		System.out.println("Gopikisan pund");
	}

	public void Method_2() {
		System.out.println("Gautam Suse");
	}

	public void Method_3() {
		System.out.println("Dipak harde");
	}

	public static void main(String[] args) {
		Parent srcParent = new AbstactMethod();
		srcParent.method();
		srcParent.Method_2();
		srcParent.Method_3();

	}

}
