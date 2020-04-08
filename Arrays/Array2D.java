package pkg.Arrays;

public class Array2D {

	public static void main(String[] args) {
		String[][] s= {
				{"A","B","C"},
				{"Q","R","S"},
				{"T","U","V"},
				{"x"}

	};
System.out.println(s.length);
System.out.println(s[2].length);
System.out.println(s[1][2]);

for(String[] i:s) {
	for(String j:i) {
		System.out.println(j);
	}
	System.out.println("________________-");
}
}
}
