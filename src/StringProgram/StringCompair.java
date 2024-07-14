package StringProgram;

public class StringCompair {

	public static void main(String[] args) {
		
		String string1="Gopikisan";
		String string2="Pund";
		String string3="Gopikisan";
		
		System.out.println("Compair String");//compair digit
		System.out.println("First String Compair Second " + string1.compareTo(string2) );
		System.out.println("First String Compair Second " + string1.compareTo(string3) );
		
		System.out.println("Equal Or Not");//caseSensitivity Matter 
		System.out.println("First String Compair Second " + string1.equals(string2));
		System.out.println("First String Compair Second " + string1.equals(string3) );
		System.out.println("First String Compair Second " + string1==(string2) );
		
		if(string1==string2)
		{
			System.out.println("String is equal");
		}
		else {
			System.out.println("String is not Equal");
		}
		
		
		

	}

}
