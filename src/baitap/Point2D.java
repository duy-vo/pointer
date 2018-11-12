package baitap;

public class Point2D extends Point {
	
	Point2D(){
		super();
	}
	
	Point2D(int x, int y){
		super(x, y);
	}

	@Override
	public Double distance() {
		Point2D kq = new Point2D();
		return distance(kq);
	}
	
	public Double distance(Point p) {
		double t1 = this.getX() - p.getX();
		double t2 = this.getY() - p.getY();
		double t3 = Math.sqrt(t1 * t1 + t2 * t2);
		return t3;
	}

	@Override
	public void print() {
		System.out.println("x= " + this.getX());
		System.out.println("y= " + this.getY());
		System.out.println("Distance 2D = " + distance());
		
	}
	
}
