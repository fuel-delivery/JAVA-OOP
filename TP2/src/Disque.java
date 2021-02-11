
public class Disque {
	private double diametre;
	public Disque() {
		this.diametre=0;
	}
	public Disque(double diametre) {
		this.diametre=diametre;
	}
	public Disque(Disque disc) {
		diametre=disc.diametre;
	}
	public double getDiametre() {
		return diametre;
	}
	public void setDiametre(double diametre) {
		this.diametre=diametre;
	}
	public double perimetre() {
		double p;
		p=Math.PI*diametre;
		return p;
	}
	public double surface() {
		/*double s;
		s=Math.PI*Math.pow(diametre/2, 2);
		return s;*/
		return Math.PI*Math.pow(rayon(), 2);
	}
	public double rayon() {
		return diametre/2;
	}
	public void afficher() {
		System.out.println("rayon:"+rayon());
		System.out.println("diametre:"+getDiametre());
		System.out.println("perimètre:"+perimetre());
		System.out.println("surface:"+surface());
	}
	
	
	
	
}
