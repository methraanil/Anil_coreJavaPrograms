package pkg.Inheritance_abstraction;

public class Abst_main {

	public static void main(String[] args) {
		Abst a;
		a=new Abst_IOS();
		a.apps();
		a.RAM();
		a.Memory();
		
		a=new Abst_Android();
		a.apps();
		a.RAM();
		a.Memory();

	}

}
