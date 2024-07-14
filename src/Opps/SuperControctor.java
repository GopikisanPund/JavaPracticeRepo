package Opps;

class Friends{
	
	int number = 300; 
	
	 Friends()
	{
		
		
		System.out.println("I am Gopikisan i  have  frd");
	}
}
class Ramesh extends Friends{
	
	public Ramesh() 
	{
		super();
		
		System.out.println(super.number);
		
	}
}

public class SuperControctor {

	public static void main(String[] args) {
		
		Ramesh ramesh =  new Ramesh();
		
		
		

	}

}
