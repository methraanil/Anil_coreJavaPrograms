package pkg.Inheritance_abstraction;

public class SuperB extends SuperA{
	int n=400;
	public void doThis() {
		System.out.println("Super B class executed");
	}
	
	public void runThis() {
		System.out.println(n);
		doThis();
		System.out.println("_____________________");
		System.out.println(super.n);
		super.doThis();
		
		
	}

}
