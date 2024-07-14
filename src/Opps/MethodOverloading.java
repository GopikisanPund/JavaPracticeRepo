package Opps;

public class MethodOverloading {
//	int a;
//	int b;
//	int c;

	public void MNC(int a, int b, int c) 
	{
		System.out.println(a + " " + b + " " + c);
	}

	public void MNC(int x,int y)
	{
		System.out.println(x +" "+ y);
		
	}
	public static void main(String[] args) 
	{
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.MNC(100,200,500);
		methodOverloading.MNC(200,400);

	}

}
