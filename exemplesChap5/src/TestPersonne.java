
public class TestPersonne {
	public static void main(String[] args) {
		Personne p=new Personne();
//		Personne p=new Personne("AAA", "BBB");
		System.out.println(p.toString());
		p.setNom("Radi");
		p.setPrenom("Bouchta");
		System.out.println(p.toString());
		Etudiant e=new Etudiant("ZZZ", "RRRR", 1, 24.5f);
		System.out.println(e.toString());
	}

}
