import java.awt.Graphics;
public class  Rectangle extends ObjetGraphique {
	public void tracer(Graphics g) {
		g.drawRect(x, y, largeur, hauteur);

	}
	public Rectangle() {
		super();
	}
	public Rectangle(int x,int y,int largeur,int hauteur) {
		super(x,y,largeur,hauteur);
	}
	public Rectangle(Rectangle r) {
		super(r);
	}

}
