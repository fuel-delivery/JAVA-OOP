
public class TestPoint2D {

	public static void main(String[] args) {
		Point2D p1=new Point2D();
		p1.afficher();
		Point2D p2=new Point2D(10, 20);
		p2.afficher();
		Point2D p3=new Point2D(10,20);
		p3.afficher();
		System.out.println("l'adresse de p2:"+p2);
		System.out.println("l'adresse de p3:"+p3);
		/*if(p2==p3) {
			System.out.println("les deux objets ont la m�me adresse");
		}
		else {
			System.out.println("les deux objets ont deux adresses diff�rentes");
		}*/
		if(p2.equals(p3)) {
			System.out.println("les deux points sont �gaux");
		}else {
			System.out.println("Les deux points sont diff�rents");
		}
		if(p2 instanceof Point2D) {
			System.out.println("p2 est un Point2D");
		}
		else {
			System.out.println("p2 n'est un Point2D");
		}
	}

}
