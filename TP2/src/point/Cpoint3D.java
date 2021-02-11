package point;
public class Cpoint3D {
	private double x;
	private double y;
	private double z;
	public Cpoint3D() {
	  
     }
	public Cpoint3D(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Cpoint3D(Cpoint3D a) {
		x=a.x;
		y=a.y;
		z=a.z;
		
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	public void setPoint(double X,double Y,double Z) {
		
	}
	public void deplacer(double dx ,double dy,double dz) {
		x+=dx;
		y+=dy;
		z+=dz;
	}
	public double distance() {
		//return Math.sqrt((x*x)+(y*y)+(z*z));
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
	}
	public double distance(Cpoint3D P) {
		//return Math.sqrt((x-P.x)*(x-P.x)+(y-P.y)*(y-P.y)+(z-P.z)*(z-P.z));
		return Math.sqrt(Math.pow(x-P.x,2)+Math.pow(y-P.y,2)+Math.pow(z-P.z,2));
	}
	public boolean egal(Cpoint3D d) {
		if (x==d.x && y==d.y && z==d.z) {
		 return true;
		}
		else {
			return false;
		}
	}
	public void afficher() {
		System.out.println("les cordonnés de Cpoint3D est :("+x+","+y+","+z+")");
	}
	@Override
	public String toString() {
		return "("+x+","+y+","+z+")";
	}
}
