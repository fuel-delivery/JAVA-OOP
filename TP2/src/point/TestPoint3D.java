package point;
public class TestPoint3D {
	public static void main(String[] args) {
		Cpoint3D p1 = new Cpoint3D(2,5,7);
		Cpoint3D p2 = new Cpoint3D(5,9,16);
		p1.afficher();
		p2.afficher();
		double d=p1.distance(p2);
		System.out.println("la distance entre p1 et p2 est : d="+d);
		double d2=p2.distance();
		System.out.println("la distance entre p2 et l'origine est : d2="+d2);
		p1.deplacer(1, -2, 3);
		p1.afficher();
		
	}	
	
}
