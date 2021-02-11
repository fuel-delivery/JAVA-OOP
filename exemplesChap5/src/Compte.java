
public class Compte implements IBanque{
	private int code;
	private double solde;
	@Override
	public double getSolde() {
		return solde;
	}
	@Override
	public void verser(double montant) {
		solde+=montant;
		
	}
	@Override
	public void retirer(double montant) {
		if(solde>montant)
			solde-=montant;
	}

}
