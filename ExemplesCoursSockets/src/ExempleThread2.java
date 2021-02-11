
public class ExempleThread2 extends Thread {
	private String nom;
	public ExempleThread2(String nom) {
		this.nom=nom;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(nom+" "+i);
		}
	}

}
