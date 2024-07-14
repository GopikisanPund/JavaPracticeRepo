package StringProgram;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "apple,Banana,strobery,graps,Orange";
		
		String[] strArr = str.split(",");
		
		for(String Fruits:strArr)
		{
			System.out.println(Fruits);
		}

	}

}
