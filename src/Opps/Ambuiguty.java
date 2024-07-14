package Opps;

class College{
	/*
	 * n your code, both the College class and the Project class have a method named Machanicle()
	 * , which overrides the method of the same name in the College class. When you instantiate a
	 *  Project object and call the Machanicle() method,
	 * there's ambiguity because the compiler doesn't know which version of the method to invoke.
	 */
	
	public void Machanicle() 
	{
		System.out.println("i am in machanical");
	}
}
class Project extends College{
	
	public void Machanicle() 
	{
		System.out.println("I am in  project class");
	}
}
public class Ambuiguty {

	public static void main(String[] args) {
		
		//Project project = new Project();
		//project.Machanicle();

	}

}
