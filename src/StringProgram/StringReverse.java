package StringProgram;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Gopikisan";
		char ch;String nString = "";
		
		for(int i = 0;i<=str.length()-1;i++)
		{
			ch =str.charAt(i);
			nString=ch+nString;
		}
		System.out.println("The String is : " +nString);
		
		

	}

}
