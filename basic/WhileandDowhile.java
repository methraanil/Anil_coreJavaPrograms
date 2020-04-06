package pkg.basic;

public class WhileandDowhile {
	public static void main(String args[]){
		int a=100;
		while(a>80){
			a-=5;
			System.out.println(a);
		}
		System.out.println("done with while");
		int b=50;
		do{
			b-=5;
			System.out.println(b);
		}while(b>10);
		System.out.println("done with do while");
		System.out.println("value of a= "+a+" value of b= "+b);
	}

}
