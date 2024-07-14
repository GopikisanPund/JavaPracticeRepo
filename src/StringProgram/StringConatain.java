package StringProgram;

public class StringConatain {

	public static void main(String[] args) {
		
		String string  =  "Pune Maharastra India";
		
		String string2 ="Pune";
		
		if(string.contains(string2))
		{
		System.out.println(string + "Contains" +string2);
		}
		else {
			System.out.println(string + "doesn Contains" +string2);
		}
	}

}
