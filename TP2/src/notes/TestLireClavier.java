package notes;
import MesUtilitaires.LireClavier;


public class TestLireClavier {

	public static void main(String[] args) {
		String res=LireClavier.litChaine("Entrer le nombre des notes:");
		int n=Integer.parseInt(res);
		double T[]=new double[n];
		double moy=0;
		for(int i=0;i<n;i++) {
			String s=LireClavier.litChaine("Entrer la note "+(i+1));
			double note=Double.parseDouble(s);
			T[i]=note;
			moy+=note;
		}
		moy=moy/n;
		System.out.println("La moyenne des notes est:"+moy);
		System.out.println("Portion des notes supurieur à "+moy+" est:");
		for(int i=0;i<n;i++) {
			if(T[i]>moy)
				System.out.print(T[i]+" ");
		}
	}

}
