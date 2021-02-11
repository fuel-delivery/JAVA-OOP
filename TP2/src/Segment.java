

import point.Cpoint3D;

public class Segment {
	private Cpoint3D origine, extremite;
	public Segment(double a, double b,double c,double d,double e,double f) {
		origine=new Cpoint3D(a,b,c);
		extremite=new Cpoint3D(d,e,f);
	}
	public Segment(Cpoint3D a, Cpoint3D b) {
		origine=a;
		extremite=b;
	}
	public double longueur() {
		return origine.distance(extremite);
	}
	public Cpoint3D getOrigine() {
		return origine;
	}
	public Cpoint3D getExtremite() {
		return extremite;
	}
	public void setSegment(Cpoint3D a,Cpoint3D b) {
		origine=a;
		extremite=b;
	}
	public void afficher() {
		
		/*System.out.println("l'origine est : ");
		origine.afficher();
		System.out.println("l'extrémiter est : ");
		extremite.afficher();*/
		System.out.println("l'origine est : "+getOrigine().toString());
		System.out.println("l'extrémiter est : "+getExtremite().toString());
		System.out.println("la longueur est : "+longueur());

	}
}
