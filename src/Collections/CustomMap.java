package Collections;
import java.util.HashMap;
import java.util.Map;
public class CustomMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
		map.put(101, "Gopikisan");
		map.put(102, "mahesh");
		map.put(103, "Ravindra");
		map.put(104, "Raj");
		map.put(105, "Gopikisan");
		
		//map.clear();
		System.out.println(map.containsValue("Raj"));
		System.out.println(map.containsKey(108));
		System.out.println(map.entrySet());
		System.out.println(map.isEmpty());
	
		
		
		//System.out.println(map);
		
		

	}

}
