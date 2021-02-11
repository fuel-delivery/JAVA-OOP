
public class Cellule implements Cloneable{
	private int i=0;
	private int t[]= {1,2};
	
	public void afficher() {
		System.out.println("i="+i+" t[0]="+t[0]+" t[1]="+t[1]);
		System.out.println("adresse de t:"+t);
	}
	public void setCellule() {
		i=10;
		t[0]=11;
		t[1]=12;
	}
	@Override
	protected Object clone() {
		try {
			Cellule c=(Cellule)super.clone();
			c.t=(int [])t.clone();
			return c;
		}catch (CloneNotSupportedException e) {
			return null;

		}
		
	}

}
