package Methods;

public class IntanceMethod 
{
	public int showing(int x,int z)
	{
		int d = x+z;
		
		System.out.println(" The Number of addition  is " + d);
		
		return 0;
		
	}

	public static void main(String[] args) 
	{
		IntanceMethod intanceMethod = new IntanceMethod();
	   intanceMethod.showing(100,200);


	}

}
