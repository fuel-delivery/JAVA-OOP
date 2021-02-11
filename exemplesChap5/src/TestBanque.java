
public class TestBanque {

	public static void main(String[] args) {
		Compte c=new Compte();
		System.out.println("Le solde initial:"+c.getSolde());
		c.verser(10000);
		System.out.println("Le solde devient après versement:"+c.getSolde());
		c.retirer(500);
		System.out.println("Le solde devient après retrait:"+c.getSolde());
	}

}
