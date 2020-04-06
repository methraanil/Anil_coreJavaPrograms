package pkg.strg;

public class Strrev {

	public static void main(String[] args) {
	   String s1="Anil";
	 strev(s1,(s1.length()));
	   
	   
	}
	public static void strev(String st,int n) {
		String temp="";
		  for(int i=n-1;i>=0;i--) {
			  temp+=st.charAt(i);
		  }
		  System.out.print(temp);
		}

}
