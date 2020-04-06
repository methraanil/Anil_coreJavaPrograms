package pkg.oops;

public class Data_Encapsulation {
	private String subj;
	private int counts;
	
	public String getSub() {
		return subj;
	}

	public void setSub(String sub) {
		this.subj = sub;
	}

	public int getCount() {
		return counts;
	}

	public void setCount(int count) {
		this.counts = count;
	}

	public void getDetails(){
		System.out.println("subject "+subj+" count is "+counts);
	}
	

}
