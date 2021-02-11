import point.Cpoint3D;

public class TestSphere {

	public static void main(String[] args) {
		CSphere c = new CSphere(2,5,7,7) ;
		c.afficher();
		System.out.println("--------Après modification----------");
		c.setSphere(new Cpoint3D(3, 4, 2), 5);
		c.afficher();
	}

}
