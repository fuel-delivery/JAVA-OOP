import point.Cpoint3D;
public class CSphere {
	private Cpoint3D centre ;
	
	private double rayon ;
	
	public CSphere() {
		centre=new Cpoint3D();
		rayon=0;
		
	}
	
	public CSphere(double X, double Y, double Z ,double rayon) {
		centre=new Cpoint3D(X, Y, Z);
		this.rayon = rayon ;
		
	}
	
	public CSphere(Cpoint3D ctr , double rayon) {
		this.centre = ctr ;
		this.rayon = rayon ;
	}
	
	public double getRayon() {
		return this.rayon ;
	}
	
	public Cpoint3D getCentre() {
		return centre;
	}
	
	public void setSphere(Cpoint3D ctr ,double rayon) {
		
		this.centre = ctr ;
		
		this.rayon = rayon ;
	}
	
	
	public double surface() {
		return  4*Math.PI *  Math.pow(this.rayon, 2)  ;
	}
	
	public double volume() {
		return (4/3) * Math.PI * Math.pow(rayon, 3) ; 
	}
	
	public void afficher() {
		//System.out.println("le rayon du sphere est : " +getRayon()) ;
		System.out.println("le rayon du sphere est : " +rayon) ;
		System.out.println("le centre du sphere est : ") ;
		//getCentre().afficher();
		Cpoint3D p=getCentre();
		p.afficher();
		double s = surface() ;
		
		System.out.println("La surface du sphere est : " + s) ;
		
		double v = volume() ;
		System.out.println("Le volume du sphere est : " + v) ;
		
	
	}

}
