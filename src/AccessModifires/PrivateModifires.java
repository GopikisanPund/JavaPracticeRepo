package AccessModifires;

class parent {

	private int var = 20;

	private void Method() {
		System.out.println("Hi I am Private Method");

	}

}

public class PrivateModifires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent  objParent = new parent();
		//System.out.println(objParent.var);
		//objParent.Method();)
//private datamember can not access form parent class because of creating private 

		
		DefaultModifire defaultModifire = new DefaultModifire();
				defaultModifire.Methodname();
	}

}
