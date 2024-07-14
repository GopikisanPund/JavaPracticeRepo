package Opps;

class College_3 {

	public void Mahanical_1() {
		System.out.println("I am in Machnaical Departments");

	}
}

class Deparntments extends College_3 {

	public void Computer() {
		System.out.println("I am in Computer Departmets");
	}
}

class Section extends College_3 {
	public void sec() {
		System.out.println("I am in one section");
	}
}

public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Section section = new Section();
		section.Mahanical_1();

	}

}
