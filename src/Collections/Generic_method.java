package Collections;

public class Generic_method {
	
	public static <T>  void deposit(T[] money) {
		for (T t : money) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {

		Integer[] moeny = { 200, 500, 700 };
		Double[] moeny2 = { 200.20, 300.10, 200.40 };
		
		deposit(moeny);
		deposit(moeny2);
	}

}
