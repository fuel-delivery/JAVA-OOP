import java.awt.Graphics;

public class ListeObjetGraphique {
	private ObjetGraphique[] liste;
	private int taille;
	private int index;
	public ListeObjetGraphique(int taille) {
		this.taille = taille;
		liste = new ObjetGraphique[taille];
		index = 0;
	}
	public void ajouter(ObjetGraphique f) {
		if (index <taille) {
			liste[index] = f;
			index++;
		}
	}
	public void tracerObjetsGraphique (Graphics g) {
		for (int i = 0; i< index; i++)
			liste[i].tracer(g);
	}

}
