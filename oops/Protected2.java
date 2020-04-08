package pkg.oops;

import pkg.Inheritance_abstraction.Protected01;

public class Protected2 extends Protected01 {
	public void inti() {
		a=20;
		//Str="ehy";
		Strng="bad";
		System.out.println("a= "+a+"\nString= "+Strng);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		Protected2 p=new Protected2();
		p.inti();

	}

}
