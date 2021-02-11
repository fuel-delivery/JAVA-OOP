
public class TestMatrice {

	public static void main(String[] args) {
		double m1[][]= {
				{1, 2,3},
				{4,5,6},
				{7,8,9}
		};
		double m2[][]= {
				{3, 2,6},
				{4,8,1},
				{5,2,9}
		};
		Matrice M1=new Matrice(m1);
		System.out.println("Matrice M1");
		M1.affiche();
		/*M1.multiplie(2);
		System.out.println("Affichage après multiplication");
		M1.affiche();*/
		Matrice M2=new Matrice(m2);
		System.out.println("Matrice M2");
		M2.affiche();
		Matrice M=M1.somme(M2);
		System.out.println("Somme de deux matrices");
		M.affiche();
		
	}

}
