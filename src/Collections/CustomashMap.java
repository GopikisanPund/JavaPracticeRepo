package Collections;

import java.util.HashMap;
import java.util.Map;

public class CustomashMap {

	public static void main(String[] args) {

		HashMap<Integer,String>map = new HashMap();
		
		map.put(101, "Gopikisan");
		map.put(102, "Ramesh");
		map.put(103, "ganesh");
		map.put(104, "Rajesh");
		
		for (Map.Entry me:map.entrySet()) 
		{
			System.out.println(me.getKey() + " - " + me.getValue());
			
		}
	}

}
