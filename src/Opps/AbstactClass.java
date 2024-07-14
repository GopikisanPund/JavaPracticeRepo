package Opps;

abstract class Vehicale {

	abstract public void Start(int a,int b);

	public void Result(int p ,int q) {
		System.out.println("Non Absract Method Gopikisan Pund "  + p + " " + q);
	}
}
class car extends Vehicale {
	public void Start(int x,int y) {
		System.out.println("Start With Keys  " + x + " " + y);
	}
}
class Bike extends Vehicale {
	public void Start(int i ,int j) {
		System.out.println("Start With Keys or Self  " + i + " " + j);
	}
}
public class AbstactClass {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.Start(100, 300);
		bike.Result(500,800);
		
		car car = new car();
		car.Start(400,500);
	}
}
