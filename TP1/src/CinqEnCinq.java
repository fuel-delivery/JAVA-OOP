
public class CinqEnCinq {

	public static void main(String[] args) {
		int somme = 0;
		int i=0;
		/* for (i = 0; i * 5 <= 100; i++) {
		somme=somme+5*i;
		System.out.println(i*5);
		}
		System.out.println("nombre de 5 en 5 est :"+i);
		System.out.println("la somme est :"+somme);*/
		int cpt=0;
		while(i<=100){
		somme=somme+i;
		cpt++;
		i=i+5;
		}
		System.out.println("nombre de 5 en 5 est :"+cpt);
		System.out.println("la somme est:"+somme);

	}

}
