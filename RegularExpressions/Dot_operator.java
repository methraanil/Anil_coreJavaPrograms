package pkg.RegularExpressions;

public class Dot_operator {

	public static void main(String[] args) {
		String pattern=".AT";
		String s="RAT";
		System.out.println(s.matches(pattern));
		String p=".*BT";
		String m="zfbsdhbkhsbBT";
		System.out.println(m.matches(p));

	}

}
