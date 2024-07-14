package Opps;

public class MainMethodOverloading {
	public static void main(String[] args) {

		System.out.println("Gopi");
		
		MainMethodOverloading mainMethodOverloading= new MainMethodOverloading();
		mainMethodOverloading.main(100, 430);;
	}

   public static void main(int a,int b) 
   {
	   System.out.println(a + " "+b);
	
}
}
