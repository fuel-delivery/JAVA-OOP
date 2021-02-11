
public class TestCellule {

	public static void main(String[] args) {
		Cellule x=new Cellule();
		System.out.println("L'adresse de x:"+x);
		/*System.out.println("afficahe de x:");
		x.afficher();
		// L'affectation
		Cellule y=x;
		System.out.println("L'affichage de y:");
		y.afficher();
		x.setCellule();
		System.out.println("L'adresse de y:"+y);
		x.afficher();
		y.afficher();*/
		//clonage
		Cellule y=(Cellule)x.clone();
		System.out.println("L'adresse de y:"+y);
		System.out.println("Affichage avant modification");
		x.afficher();
		y.afficher();
		x.setCellule();
		System.out.println("Affichage après modification");
		x.afficher();
		y.afficher();
		
		
	}

}
