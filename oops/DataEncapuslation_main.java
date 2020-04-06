package pkg.oops;

public class DataEncapuslation_main {

	public static void main(String[] args) {
		Data_Encapsulation de=new Data_Encapsulation();
		de.setCount(5);
		de.setSub("Maths");
		de.getDetails();
		System.out.println(de.getCount());
	}

}
