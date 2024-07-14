package Opps;

class Parent
{
	public void Result(String a,int b) 
	{
		System.out.println(a + " " + b);
	}
}
class Chiled_1 extends Parent
{
	public void Result(String x,int y) 
	{
		System.out.println(x + " " + y);
	}
}
public class MethodOverriding 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chiled_1 chiled = new Chiled_1();
		chiled.Result("Gopikisan",100);
		
		

	}

}
