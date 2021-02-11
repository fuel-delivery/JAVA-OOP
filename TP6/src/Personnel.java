
public class Personnel extends Personne{
	protected String adresse;
	protected float salaire;
	public Personnel() {
		//super();
		nom="";
		age=0;
		adresse="";
		salaire=0;
	}
	public Personnel(String nom, byte age, String adresse, float salaire) {
		super(nom, age);
		//this.nom=nom;
		//this.age=age;
		this.adresse=adresse;
		this.salaire=salaire;
	}
	public Personnel(Personnel p) {
		//super(p.nom, p.age);
		this.nom=p.nom;
		this.age=p.age;
		this.adresse=p.adresse;
		this.salaire=p.salaire;
	}
	public String getAdresse() {
		return adresse;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setPersonnel(String nom, byte age, String adresse, float salaire) {
		//super.setPersonne(nom, age);
		this.nom=nom;
		this.age=age;
		this.adresse=adresse;
		this.salaire=salaire;
	}
	public String toString() {
		return super.toString()+", adresse:"+adresse+", salaire:"+salaire;
		//return "nom:"+getNom()+", age:"+getAge()+", adresse:"+adresse+", salaire:"+salaire;
	}
	
	

}
