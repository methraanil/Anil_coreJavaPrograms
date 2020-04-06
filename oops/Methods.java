package pkg.oops;

public class Methods {
	public static void main(String args[]){
		Methods m=new Methods();
		m.display();
		m.addition(2, 3);
	int c=m.multiply(2, 3);
	System.out.println(c);
	int d=m.division(6, 2);
	System.out.println(d);
		
	}
	public void display(){
		System.out.println("Methods Example");
	}
	public void addition(int a,int b){
		System.out.println(a+b);
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public int division(int a,int b){
		return a/b;
	}

}
