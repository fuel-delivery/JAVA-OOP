
public class Personne {
	private String nom;
	private String prenom;
	public Personne() {
//		nom="Alaoui";
//		prenom="Mohammed";
		this("Alaoui", "Mohammed");
	}
	public Personne(String n, String p) {
		//this();
		nom=n;
		prenom=p;
	}
	public void setNom(String name) {
		nom=name;
	}
	public void setPrenom(String lastName) {
		prenom=lastName;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	@Override
	public String toString() {
		return nom+" "+prenom;
	}

}
