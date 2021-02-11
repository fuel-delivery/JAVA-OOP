
public class Pomme extends Fruit{
	public Pomme(int p) {
		poids=p;
	}
	public void affiche(){
		System.out.println("C'est une pomme");
	}
	public void affichePoids(){
		System.out.println("le poids de la pomme est:"+poids+" grammes");
	}


}
