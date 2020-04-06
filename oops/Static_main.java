package pkg.oops;

public class Static_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_keyword s=new Static_keyword();
		Static_keyword.name="anil";
		s.marks=100;
		s.grade="2nd";
				
				
	   Static_keyword s1=new Static_keyword();
	   Static_keyword.name="sunil";
		s1.grade="2nd";
		s1.marks=98;
		s.display();
		s1.display();
			
		Static_keyword.name="govind";
		System.out.println(s.name);
	Static_keyword.topper();
	}

}
