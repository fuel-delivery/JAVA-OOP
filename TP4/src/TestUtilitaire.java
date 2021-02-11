
public class TestUtilitaire {

	public static void main(String[] args) {
		Utilitaire U=new Utilitaire();
		int Tab[]=U.genere(4);
		/*for(int nb:Tab) {
			System.out.print(nb+" ");
		}*/
		U.affiche(Tab);
		int T[]= {2, 4, 8,14};
		int R[]=U.somme(Tab, T);
		System.out.println();
		if(R!=null)
			U.affiche(R);
	}

}
