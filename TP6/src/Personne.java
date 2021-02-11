
public class Personne {
	protected String nom;
	protected byte age;
	public Personne() {
		nom="";
		age=0;
	}
	public Personne(String nom, byte age) {
		this.nom=nom;
		this.age=age;
	}
	public Personne(Personne p) {
		nom=p.nom;
		age=p.age;
	}
	public void setPersonne(String nom, byte age) {
		this.nom=nom;
		this.age=age;
	}
	public String getNom() {
		return nom;
	}
	public byte getAge() {
		return age;
	}
	public String toString() {
		return "nom:"+nom+", age:"+age;
		
	}
	
	
	
}
