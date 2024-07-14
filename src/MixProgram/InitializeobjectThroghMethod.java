package MixProgram;

public class InitializeobjectThroghMethod
{
	int id;String nameString;
	
	public void PrintResult(int r,String s) 
	{
		id = r;
		nameString=s;
	}
	
	public String toString() {
		return "id "+ id + "nameString "+ nameString;
	}

	public static void main(String[] args) {
		
		InitializeobjectThroghMethod in= new InitializeobjectThroghMethod();
		
		in.PrintResult(1000,"Ram");
		System.out.println(in.toString());
		in.PrintResult(200,"lakshaam");
		System.out.println(in.toString());
	}

}
