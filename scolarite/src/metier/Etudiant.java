package metier;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String ville;
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getEmail() {
		return email;
	}
	public String getVille() {
		return ville;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

}
