package Opps;

interface Z1 {
	static void interface1() 
	{
		System.out.println("This is interface_1");
	}
}

interface Z2
{
	default void Interface_2()
	{
		System.out.println("This is interface_2");
	}

}

public class Interface_1  implements Z1,Z2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Z1.interface1();
	//	Z2.Interface_2();
		
		Interface_1 interface_1 = new Interface_1();
		interface_1.Interface_2();
		
		

	}

}
