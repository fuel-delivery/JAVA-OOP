package notes;
import MesUtilitaires.LireClavier;


public class TestLireClavier2 {

	public static void main(String[] args) {
		String res=LireClavier.litChaine("Entrer le nombre des notes:");
		int n=Integer.parseInt(res);
		float T[]=new float[n];
		float moy=0;
		for(int i=0;i<n;i++) {
			float note=LireClavier.litFloat("Entrer la note "+(i+1));
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
