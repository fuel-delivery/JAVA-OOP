import java.awt.Graphics;

public class Bouton extends Rectangle{
	private String text;
	public Bouton() {
		super();
	}
	public Bouton(int x, int y, int lar, int haut, String text) {
		super(x,y, lar, haut);
		this.text=text;
	}
	public Bouton(Bouton b) {
		//super(b);
		x=b.x;
		y=b.y;
		largeur=b.largeur;
		hauteur=b.hauteur;
		text=b.text;
	}
	public void setText(String text) {
		this.text=text;
	}
	public String getText() {
		return text;
	}
	public void tracer(Graphics g) {
		super.tracer(g);
		int dx=x+largeur/2;
		int dy=y+hauteur/2;
		g.drawString(text, dx, dy);
	}
	
	
	
	
	
	
	
	

}
