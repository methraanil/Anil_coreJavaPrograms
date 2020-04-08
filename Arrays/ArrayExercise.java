package pkg.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6};
		int temp=0;
		int j=n.length-1;
		for(int i=0;i<((n.length)/2)-1;i++) {
			temp=n[i];
			n[i]=n[j];
			n[j]=temp;
			j--;
		}
		for(int i:n)
			System.out.println(i);

	}

}
