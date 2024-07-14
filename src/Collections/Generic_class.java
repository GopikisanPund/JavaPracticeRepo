package Collections;

public class Generic_class<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic_class<Integer> reaClass= new Generic_class<Integer>();
		reaClass.add(10);
		Generic_class<Double> circleClass= new Generic_class<Double>();
		circleClass.add(2.5);
		
		System.out.println(reaClass.get());
		System.out.println(circleClass.get());
		
		

	}

}
