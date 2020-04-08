package pkg.Arrays;

public class Array_of_objects {

	public static void main(String[] args) {
		Object[][] arr=
			{
					{"Anil",22,'m'},
					{"Sunil",25,'m'},
					{"Laxmi",45,'f'}
					
			};
		for(Object[] a:arr) {
			for(Object b:a) {
				System.out.print(" "+b);
			}
			System.out.println("");
		}
	}

}
