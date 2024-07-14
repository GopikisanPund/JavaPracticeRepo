package GetterSetter;

class A {
	private int no;
	private String name;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

}

public class SetterGetter_Enc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A enc = new A();
		enc.setNo(100);
		enc.setname("Gopikisan");

		int number = enc.getNo();
		String names = enc.getname();
		
		
		System.out.println("No is  " + number);
		System.out.println("Names is  " + names);
	}

}
