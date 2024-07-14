package Collections;

public class Generic_Class_2<T> {

	private T m;
	
	public void setvalue(T m) 
	{
		this.m = m;
	}
	public T getvalue() 
	{
		return m;
	}

	public static void main(String[] args) 
	{
		Generic_Class_2<Integer> class_2 = new Generic_Class_2<Integer>();
		class_2.setvalue(100);
		class_2.setvalue(300);
		Generic_Class_2<String> class_3 = new Generic_Class_2<String>();
		class_3.setvalue("Gopi");
		class_3.setvalue("Kishan");
		
		System.out.println(class_2.getvalue());
		System.out.println(class_3.getvalue());
		

	}

}
