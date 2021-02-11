import java.awt.Graphics;
public class  Rectangle extends ObjetGraphique {
	public void tracer(Graphics g) {

	}
	public Rectangle() {
		super();
	}
	public Rectangle(int x,int y,int hauteur,int largeur) {
		super(x,y,largeur,hauteur);
	}
	public Rectangle(Rectangle r) {
		super(r);
	}

}
