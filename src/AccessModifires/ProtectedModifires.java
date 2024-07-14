package AccessModifires;

class Protect {
	protected void Protection() {
		System.out.println("Hi i am protected Method");

	}
}

public class ProtectedModifires {

	public static void main(String[] args) {
	
		Protect protect = new Protect();
		protect.Protection();
	}

}
