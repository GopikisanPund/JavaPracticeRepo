package MixProgram;

public class ThisControctor {
	int id;
	String nameString;
	String lastnameString;

	public ThisControctor(int id, String nameString, String lastnameString) {
		this.id = id;
		this.nameString = nameString;
		this.lastnameString = lastnameString;

	}

	void Result() {
		System.out.println("id is  : " + id);
		System.out.println("name is : " + nameString);
		System.out.println("Lastname is : " + lastnameString);
	}

	public static void main(String[] args) {

		ThisControctor srControctor = new ThisControctor(100,"Gopikisan","pund");
////		Scanner srcScanner = new Scanner(System.in);
//		System.out.println("Enter id ");
//		int id=srcScanner.nextInt();
//		System.out.println("Enter First name");
//		String nameString = srcScanner.next();
//		System.out.println("Enter last name");
//		String lastname=srcScanner.next();

		srControctor.Result();

	}

}
