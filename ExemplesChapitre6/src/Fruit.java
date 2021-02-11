
public abstract class Fruit {
	protected int poids;
	public Fruit(){
	}
	public void affiche(){
		System.out.println("C'est un fruit");
	}
	public String toString() {
		return "poids:"+poids;
	}
	public abstract void affichePoids();

}
