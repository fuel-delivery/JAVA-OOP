
public class Etudiant extends Personne{
	private int niveau;
	private float moyenne;
	public Etudiant(String nom, String prenom, int niv, float moy) {
		super(nom, prenom);
		niveau=niv;
		moyenne=moy;
	}

}
