package pkg.oops;

public class Methodoverloading {
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public void add(int a,double b){
		System.out.println(a+b);
	}
	public void add(double a,int b){
		System.out.println(a+b);
	}
	public void add(double a,double b){
		System.out.println(a+b);
	}

}
