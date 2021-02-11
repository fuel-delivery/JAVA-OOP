
public class Ballon {
	private   static int count;
	private String couleur;
	private  int num;

	public Ballon() {
		this.couleur="blanc";
		count++;
		num=count;
		System.out.println("Ballon crée :"+num);
	}

	public Ballon(String couleur) {
		this.couleur = couleur;
		count++;
		num=count;
		System.out.println("Ballon crée :"+num);
	}
	public void afficheBallon()
	{
		System.out.println("Ballon :"+couleur+" numero :"+num);
	}

	public int getIdent() {
		return num;
	}
	public   int getIdentMax() {
		return count;
	}

	public void afficheBallon(String msg) {
		System.out.println(msg+couleur+" numero :"+num);

	}
	
	protected void finalize() throws Throwable {
		System.out.println("Le Ballon est détruit");
		count--;
	}





}
