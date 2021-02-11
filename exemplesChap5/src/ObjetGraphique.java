import java.awt.Graphics;
public abstract class ObjetGraphique {
	protected int x;
	protected int y;
	protected int largeur;
	protected int hauteur;
   public ObjetGraphique() {
	   
   }
   public ObjetGraphique(int x, int y,int largeur,int hauteur ) {
	   this.x=x;
	   this.y=y;
	   this.largeur=largeur;
	   this.hauteur=hauteur;
   }
   public ObjetGraphique(ObjetGraphique a) {
	   x=a.x;
	   y=a.y;
	   largeur=a.largeur;
	   hauteur=a.hauteur;
   }
   public int getHauteur() {
	   return hauteur;
   }
   public int getlargeur() {
	   return largeur;
   }
   public int getX() {
	   return x;
   }
   public int getY() {
	   return y;
   }
   public void setObjetGraphique(int x,int y,int hauteur,int largeur) {
	   this.x=x;
	   this.y=y;
	   this.hauteur=hauteur;
	   this.largeur=largeur;
   }
   public void setTaille(int largeur,int hauteur) {
	   this.largeur=largeur;
	   this.hauteur=hauteur;
	   
   }
   public void setPosition(int x,int y) {
	   this.x=x;
	   this.y=y;
   }
   public void deplacer(int dx ,int dy) {
	   x=x+dx;
	   y=y+dy;
   }
   public abstract void tracer(Graphics g);
   }
   
