package Opps;

abstract class Test
{
	abstract void testMethod(int x , int y);
	
	public void nonStaticMethod(int a, int b ) 
	{
		System.out.println("Additions " + (a + b));
		
	}
}
class TestAbstactMethod extends Test
{
	public void testMethod(int x,int y) 
	{
		
		System.out.println("substaction" +( x - y));
	}
}

public class AbstactMethod_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAbstactMethod abstactMethod = new TestAbstactMethod();
		abstactMethod.testMethod(100,400);
		abstactMethod.nonStaticMethod(500,400);

	}

}
