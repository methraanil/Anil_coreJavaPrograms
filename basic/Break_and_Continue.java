package pkg.basic;

public class Break_and_Continue {
	public static void main(String args[]){
		int a=100;
		while(a>80){
			a-=5;
			if(a==85)
				break;
			System.out.println(a);
		}
		System.out.println("done with while");
		int b=50;
		do{
			b-=5;
			if(b==40)
				continue;
			System.out.println(b);
		}while(b>10);
		System.out.println("done with do while");
		System.out.println("value of a= "+a+" value of b= "+b);
	}


}
