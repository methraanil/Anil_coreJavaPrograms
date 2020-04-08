package pkg.Inheritance_abstraction;

public class PolygonMain {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.base=5;
		t.height=10;
		t.Area();
		
		Rectangle r=new Rectangle();
		r.base=10;
		r.height=20;
		r.Area();

	}

}
