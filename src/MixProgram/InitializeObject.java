package MixProgram;

public class InitializeObject {
	
	int no;
	String nameString;
	
	public InitializeObject(int no,String nameString) 
	{
	 this.no=no;
	 this.nameString=nameString;
	}
	
	public void result() 
	{
	System.out.println(no + "\n"+ nameString);	
	}

	public static void main(String[] args) {
		
		InitializeObject initializeObject = new InitializeObject(1000, "Ram");
		
		initializeObject.result();

	}

}
