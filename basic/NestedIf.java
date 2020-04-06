package pkg.basic;

public class NestedIf {

	public static void main(String[] args) {
		int marks=654;
		
		if(marks>90)
			System.out.println("A grade");
			else if(marks>=75)
				System.out.println("B grade");
			else if(marks>=60)
				System.out.println("C grade");
			else if(marks>=40)
				System.out.println("D grade");
			else if(marks<40)
				System.out.println("F grade");
		
		else{
			System.out.println("Invalid marks");

	}
	}
}
