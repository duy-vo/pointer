package baitap;

public class SDPoint {
	
	public static void main (String[] args) {
		Point p1 = new Point2D(5, 7);
		Point p2 = new Point2D(6, 9);
		
		System.out.println("=============Point2D=============");
		p1.print();
		
		Double d1 = p1.distance(p2);
		System.out.println("A - B = " + d1);
		
		Point p3 = new Point3D(5, 6, 7);
		Point p4 = new Point3D(6, 7, 8);
		
		System.out.println("=============Point3D=============");
		p3.print();
		d1 = p4.distance(p3);
		System.out.println("A - B = " + d1);
		
	}

}
