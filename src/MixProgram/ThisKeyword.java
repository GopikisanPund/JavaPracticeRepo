package MixProgram;

public class ThisKeyword {
	
	String name = "";
	int no;
	float fee;
	
	
	public ThisKeyword(String name,int no,float fee)
	{
	this.name=name;
	this.no=no;
	this.fee=fee;
	}
	void display()
	{
		System.out.println(name + " " + no + " " + fee);
	}

	public static void main(String[] args) {
		
		ThisKeyword srKeyword = new ThisKeyword("Gopikisan", 133, 500000);
		ThisKeyword srKeyword1 = new ThisKeyword("RamJanam", 11, 450000);
		
		srKeyword.display();
		srKeyword1.display();
		
	}

}
