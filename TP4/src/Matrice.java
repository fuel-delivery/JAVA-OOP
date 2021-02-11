
public class Matrice {
	private double m[][];
	public Matrice(double mat[][]) {
		m=new double[mat.length][mat.length];
		m=mat;
	}
	public Matrice(int taille) {
		m=new double[taille][taille];
	}
	public void multiplie(double a) {
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m.length;j++)
				m[i][j]=a*m[i][j];
	}
	/*public double[][] somme(double mat[][]){
		double M[][]=new double[m.length][m.length];
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m.length;j++)
				M[i][j]=m[i][j]+mat[i][j];
		return M;
	}*/
	public Matrice somme(Matrice P) {
		int n=m.length;
		//int n=P.m.length;
		//Matrice M=new Matrice(m);
		Matrice M=new Matrice(n);
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				M.m[i][j]=this.m[i][j]+P.m[i][j];
		return M;		
	}
	public void affiche() {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
		
	}

}
