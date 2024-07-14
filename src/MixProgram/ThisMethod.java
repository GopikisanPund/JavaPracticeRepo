package MixProgram;

public class ThisMethod {
	
	void method_1()
	{
		System.out.println("Method_1 Method is colling from  this Keyword ");
	}
	
	void Method_2()
	{
		System.out.println("Method_2");
		this.method_1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisMethod srMethod = new ThisMethod();
		srMethod.Method_2();

	}

}
