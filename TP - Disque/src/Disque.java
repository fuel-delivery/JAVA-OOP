
public class Disque {
	private float D;
	public Disque(float D) {
		this.D = D;
		
	}
	public void ModifierDiametre(float D) {
		this.D = D;
	}
	public void CalculerP (float D) {
		float P;
		P = (float) (2 * 3.14 * D);
	}
}
