package Do_While_loop;

public class AdditionProgram {

	public static void main(String[] args) {
	
		int i = 21,sum= 0;
		
		do {
			
			sum+=i;
			i--;
			
		} while (i>10);
		System.out.println(sum);
		
	}

}
