package pkg.oops;

public class RoadToll {
	String type="";
	int a;
	public void calculatetoll(){
		if(a==2){
			System.out.println("No toll fee");
		}
		else if(a==4){
			System.out.println("Toll charge is 10");
		}
		else if(a>4){
			System.out.println("Toll charge is 20");
		}
		else{
			System.out.println("not a valid data");
		}
	}
    public RoadToll(){
    	System.out.println("constructer is executed");
    }
    public RoadToll(String type,int a){
    	this.type=type;
    	this.a=a;
    }
    public RoadToll(int a){
    	this.a=a;
    }

}
