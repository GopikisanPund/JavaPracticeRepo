package AccessModifires;

class pub {
	public int a = 30, b;

	public pub(int b) {
		this.b = b;
	}

	public void methodPublic() {

		System.out.println("I am Public method");
		System.out.println("i am b " + b + " " + a);
	}
}

public class PublicModifires {

	public static void main(String[] args) {

		pub objPub = new pub(1000);
		objPub.methodPublic();

	}

}
