
public class ProduitImpaire {

	public static void main(String[] args) {
		int i=0;
		int n=0;
		int res=1;
		for(i=0;2*i+1<=15;i++) {
			n=2*i+1;
			res=res*n;
			System.out.println(n);
		}
		System.out.println("Le produit des impaires de 1 à 15 est:"+res);
	}

}
