package pkg.RegularExpressions;

public class Characterss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pat="\\w{1,}[@]\\w{1,}[.]\\w{2,}";
		String m="methraanil@gmail.cc";
		
		System.out.println(m.matches(pat));
		
		String p="\\w{1,}\\W{2}\\w{1,}";
		String a="Anil]#Kumar";
		System.out.println(a.matches(p));
	}

}
