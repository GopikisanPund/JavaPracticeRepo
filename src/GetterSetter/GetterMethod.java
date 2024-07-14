package GetterSetter;

public class GetterMethod extends SetterMethod {
	public int getno() {
		return no;

	}

	public Double getvalue() {
		return value;

	}

	public float getmarks() {
		return marks;

	}

	public String getname() {
		return name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetterMethod getterMethod = new GetterMethod();

		getterMethod.setno(1000);
		getterMethod.setvalue(93.000);
		getterMethod.setmarks(199);
		getterMethod.setname("Akanksha");

		int noms = getterMethod.getno();
		Double values = getterMethod.getvalue();
		float markss = getterMethod.getmarks();
		String namess = getterMethod.getname();
		
		System.out.println(noms + " " + values + "  " + markss + "  " + namess);

	}

}
