package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleProgram {

	public static void main(String[] args) {
	
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add("Gopikisan");
		list.add(100);
		list.add("mahesh");
		list.add(90);
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
