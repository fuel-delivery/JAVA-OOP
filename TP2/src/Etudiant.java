public class Etudiant {
    private static int num ;
    private String nom ;
    private String prenom ;

    Etudiant(String nom,String prenom) {
        num++ ;
        this.nom = nom ;
        this.prenom = prenom ;
    }

    public String toString() {
        return "Etudiant numéro : " + num + " ,nom : " + this.nom +  " ,prenom : "+ this.prenom ;
    }

    public String getNom() {
        return this.nom ;
    }

    public String getPrenom() {
        return this.prenom ;
    }
    public int getNum() {
        return Etudiant.num ;
    }

    public void setNom(String nom) {
        this.nom = nom ;
    }

    public void setPrenom(String prenom) {
        this.nom = prenom ;
    }
    public void setNum(int num) {
    	Etudiant.num = num ;
    }

}
