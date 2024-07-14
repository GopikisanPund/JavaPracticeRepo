package Opps;

class Animal {

	public void eat() {
		System.out.println("Eatting");
	}
}

class Dog extends Animal {

	public void bark() {
		System.out.println("barking");
	}
}

class Cat extends Dog {

	public void weep() {
		System.out.println("Weeping");
	}
}

public class MultilevalInheritance {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.bark();
		cat.weep();
		cat.eat();
				

	}

}
