
public class Enseignant extends Personnel{
	private String matiereEnseignant;
	public Enseignant() {
		super();
		matiereEnseignant=null;
	}
	public Enseignant(String nom, byte age, String adresse, float salaire, String matiere) {
		//super(nom, age, adresse, salaire);
		this.nom=nom;
		this.age=age;
		this.adresse=adresse;
		this.salaire=salaire;
		matiereEnseignant=matiere;
	}
	public Enseignant(Enseignant e) {
		super(e.nom, e.age, e.adresse, e.salaire);
		matiereEnseignant=e.matiereEnseignant;
	}
	public void setEnseignant(String nom, byte age, String adresse, float salaire, String matiere) {
		super.setPersonnel(nom, age, adresse, salaire);
		this.matiereEnseignant=matiere;
	}
	public String getMatiereEnseignant() {
		return matiereEnseignant;
	}
	public String toString() {
		return super.toString()+", Matière de l'enseignant:"+matiereEnseignant;
	}
	
	

}
