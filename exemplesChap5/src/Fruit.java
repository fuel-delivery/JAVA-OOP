
public abstract class Fruit {
	protected int poids;
	public Fruit(){
		System.out.println("Cr�ation d�un fruit");
	}
	public void affiche(){
		System.out.println("C'est un fruit");
	}
	public abstract void affichePoids();

}
