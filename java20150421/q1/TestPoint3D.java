public class TestPoint3D {
  public static void main(String[] args) {
     Point3D pt1, pt2;
	 pt1 = new Point3D(3.0, 4.0, 5.0);
     pt2 = new Point3D(0.0, 0.0, 10.0);
     System.out.println(pt1);
     System.out.println(pt2);
     System.out.println(pt1.distanceFrom(pt2));
     System.out.println(Point3D.getNoOfPoints());
  }
}

class Point3D{
		public  double x;
		public  double y;
		public  double z;
		public static  int noOfPoints;
	public  Point3D(){
		x = 0;
		y = 0;
		z = 0;
	}
	public Point3D(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
		noOfPoints++;
	}
	public double distanceFrom(Point3D x){
		double tag = Math.pow(this.x-x.x,2) +Math.pow(this.y-x.y,2) +Math.pow(this.z-x.z,2);
		tag = Math.sqrt(tag);
		return tag;
	}
	public static int getNoOfPoints(){
		return noOfPoints;
	}
	public String toString(){
		String tag = "(" + x +"," +y+","+z+")";
		return tag;
	}
}