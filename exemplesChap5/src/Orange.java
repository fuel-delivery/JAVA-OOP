
public class Orange extends Fruit{
	public Orange(int p){
		poids=p;
		System.out.println("Création d'une orange de "+poids+" grammes");}
	public void affiche(){
		System.out.println("C'est une orange");
	}
	public void affichePoids(){
		System.out.println("le poids de l’orange est:"+poids+" grammes");
	}
}
