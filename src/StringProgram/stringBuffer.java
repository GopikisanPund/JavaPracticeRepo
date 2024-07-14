package StringProgram;

public class stringBuffer {

	public static void main(String[] args) {
		
		String str = "Gopikisan pund";
		String str2 ="pund";
		
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer buffer2 = new StringBuffer(str2);
		
		System.out.println(buffer.append("\n" + "pune"));
		System.out.println(buffer.capacity());//defualt capacity 16 so after adding String size
		System.out.println(buffer.replace(4, 8,"Gopi"));
		System.out.println(buffer.delete(2, 5));
		System.out.println(buffer2.reverse());

	}

}
