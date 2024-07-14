package Collections;

import java.util.ArrayList;
import java.util.List;

public class Generic_class_3 <T>
{
	private List<T>valueList;
	
	Generic_class_3()
	{
		this.valueList = new ArrayList<>();
	}
	
	public void setList(T m)
	{
		this.valueList.add(m);
	}
	
	public List<T> getvaluesList() 
	{
		return valueList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic_class_3<Integer> a = new Generic_class_3<Integer>();
        a.setList(100);
        a.setList(300);

        Generic_class_3<String> class_3 = new Generic_class_3<String>();
        class_3.setList("Gopi");
        class_3.setList("Kishan");
        
        System.out.println("values for class 2");
        
        for (Integer value : a.getvaluesList())
        {
        	System.out.println(value);
			
		}
        
		System.out.println("values for class 3");

		for (String value : class_3.getvaluesList()) {
			System.out.println(value);

		}

	}

}
