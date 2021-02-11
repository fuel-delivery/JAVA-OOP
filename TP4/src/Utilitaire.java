
public class Utilitaire {
	
	public int [] genere(int n) {
		int T[]=new int[n];
		for(int i=0;i<n;i++) {
			T[i]=2*i+1;
		}
		return T;
	}
	public int [] somme(int T1[], int T2[]) {
		if(T1.length==T2.length) {
			int T[]=new int[T1.length];
			for(int i=0;i<T.length;i++)
				T[i]=T1[i]+T2[i];
			return T;
		}
		else
			return null;
		
	}
	public void affiche(int T[]) {
		for(int i=0; i<T.length;i++)
			System.out.print(T[i]+" ");
	}

}
