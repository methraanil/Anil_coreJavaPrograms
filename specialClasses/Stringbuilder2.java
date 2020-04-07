package pkg.specialClasses;

public class Stringbuilder2 {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Anil Methra");
		b.insert(4," kumar");
		System.out.println(b);
		b.replace(0, 4, "ANIL");
		System.out.println(b);
		b.delete(11, 17);
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		b.reverse();
		System.out.println(b);
	}

}
