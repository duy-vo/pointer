package baitap;

public class Point3D extends Point {
	
	private int z;
	
	Point3D(){
		super();
		this.z = 0;
	}
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}

	@Override
	public void print() {
		System.out.println("x= " + this.getX());
		System.out.println("y= " + this.getY());
		System.out.println("z= " + this.getZ());
		System.out.println("Distance 3D = " + distance());
		
	}
	

	@Override
	public Double distance() {
		Point3D kq = new Point3D();
		return distance(kq);
	}

	@Override
	public Double distance(Point p) {
		Point3D tmp = (Point3D) p;
		double t1 = this.getX() - tmp.getX();
		double t2 = this.getY() - tmp.getY();
		double t3 = this.getZ() - tmp.getZ();
		double t4 = Math.sqrt(t1 * t1 + t2 * t2 + t3 * t3);
		return t4;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
}
