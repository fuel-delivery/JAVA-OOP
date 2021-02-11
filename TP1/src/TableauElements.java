
public class TableauElements {

	public static void main(String[] args) {
		int T[]= {-20, 0, 3, -5, 8,12, 2, 4, 40, 13};
		int min,max,somme=0;
		min=max=T[0];
		for(int i=0;i<T.length;i++) {
			if(min>T[i])
				min=T[i];
			if(max<T[i])
				max=T[i];
			somme+=T[i];
		}
		System.out.println("Le minimum est:"+min);
		System.out.println("Le maximum est:"+max);
		System.out.println("La somme est:"+somme);
	}

}
