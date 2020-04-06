package pkg.oops;

public class RoadTollMain {

	public static void main(String[] args) {
		RoadToll r=new RoadToll(2);
		RoadToll t=new RoadToll();
		t.a=6;
		t.calculatetoll();
		RoadToll h=new RoadToll("suv",2);
		h.calculatetoll();
	}

}
