import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestListeGraphiques extends JPanel{
	private ListeObjetGraphique liste;
	public TestListeGraphiques() {
		liste=new ListeObjetGraphique(6);
		liste.ajouter(new Rectangle(50, 50, 100, 60));
		liste.ajouter(new Rectangle(170, 50, 100, 60));
		liste.ajouter(new Bouton(50, 140, 80, 40, "OK"));
		liste.ajouter(new Bouton(150, 140, 80, 40, "Envoyer"));
		liste.ajouter(new Cercle(200, 200, 40));
		liste.ajouter(new Cercle(260, 200, 50));
		JFrame fen=new JFrame();
		fen.setSize(500, 500);
		fen.setVisible(true);
		fen.add(this);
		
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		liste.tracerObjetsGraphique(g);
	}

	public static void main(String[] args) {
		new TestListeGraphiques();
		
	}

}
