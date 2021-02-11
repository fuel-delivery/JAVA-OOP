import java.awt.Graphics;

public class Cercle extends ObjetGraphique{
	private int rayon;
	public Cercle() {
		super();
	}
	public Cercle(int x, int y, int rayon) {
		this.x=x;
		this.y=y;
		this.rayon=rayon;
	}
	public Cercle(Cercle c) {
		this(c.x, c.y,c.rayon);
		/*this.x=c.x;
		this.y=c.y;
		this.rayon=c.rayon;*/
	}
	public void setRayon(int r) {
		rayon=r;
	}
	public int getRayon() {
		return rayon;
	}
	
	@Override
	public void tracer(Graphics g) {
		g.drawOval(x, y, rayon, rayon);
	}
	

}
