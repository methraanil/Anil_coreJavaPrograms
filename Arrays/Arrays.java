package pkg.Arrays;

public class Arrays {

	public static void main(String[] args) {
		String[] s= {"Sunday","monday","tuesday","thursday","friday","Saturday"};
		int[] a= {2,4,6,8,10};
		char[] c= {'a','e','i','o','u'};
		
		System.out.println("Array of strings");
		for(int i=0;i<s.length-1;i++) {
			System.out.println(s[i]);
		}
		System.out.println("\nArray of integers");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("\nArray of characters");
		for(int i=0;i<c.length-1;i++) {
			System.out.println(c[i]);
		}

	}

}
