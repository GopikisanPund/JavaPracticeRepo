package Opps;

class country
{
	int ID = 100;
	
	public void India() 
	{
		System.out.println("I am Idian");
	}
}
class America extends country{
	
	int No= 200;
	
	public void Japan() 
	{

		//System.out.println("I am Japnium");
		
		super.India();
		System.out.println(super.ID);
	}
	
}
public class Super_2 {

	public static void main(String[] args) {
		
		America america = new America();
		america.Japan();

	}

}
