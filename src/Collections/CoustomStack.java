package Collections;
import java.util.Stack;

public class CoustomStack{

	public static void main(String[] args) {

		Stack s = new  Stack();
	 	s.push(100);
	 	s.push(200);
		s.push(200);
		s.push(200);
		
		
		System.out.println("Befor stack " + s);
		
		s.pop();
		
		System.out.println("after pop  stack " + s);
	
		//Peak 
		
		System.out.println("after peak stack " + s.peek());
		
		System.out.println(s.search(100));
		
		
		
		
		
		
	 	
	 	}

}
