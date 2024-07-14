package Opps;

interface G1
{

	void interface_1();
	
}

interface G2 extends G1
{
	void interface_2();
	
	}

public class InterfaceInherite implements G1,G2{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		InterfaceInherite inherite = new InterfaceInherite();
		inherite.interface_1();
		inherite.interface_2();

	}

	@Override
	public void interface_2() {
		// TODO Auto-generated method stub
		
		System.out.println("This is Interface_2 Method");
		
	}

	@Override
	public void interface_1() {
		// TODO Auto-generated method stub
		
		System.out.println("This is Interface_1 Method");
		
	}

}
