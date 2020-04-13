package pkg.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazy {

	public static void main(String[] args) {
		String s="AAaskjdfnjsfnBBsjandjsnfAAnsdndlBBslkdnflAAsndf;nfBB";
		String p="AA.*?BB";
		Pattern pt=Pattern.compile(p);
		Matcher m=pt.matcher(s);
		System.out.println(m.results().count());
		System.out.println("_______________________");
		System.out.println(m.results());
		System.out.println("___________________________-");
		m.reset();
		 while(m.find()) {
			 System.out.println("Starts at ::"+m.start());
			 System.out.println(m.group());
		 }
	}

}
