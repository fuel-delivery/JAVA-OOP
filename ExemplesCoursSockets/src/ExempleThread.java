
public class ExempleThread implements Runnable {
	private String nom;
	public ExempleThread(String nom) {
		this.nom=nom;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(nom+" "+i);
		}
	}

}
