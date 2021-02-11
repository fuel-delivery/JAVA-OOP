import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGraphiqueV2 extends JPanel {

	private List<ObjetGraphique> liste;
	public TestGraphiqueV2(String titre) {
		liste=new ArrayList<>();
		liste.add(new Rectangle(50, 50, 100, 60));
		liste.add(new Rectangle(170, 50, 100, 60));
		liste.add(new Bouton(50, 140, 80, 40, "OK"));
		liste.add(new Bouton(150, 140, 80, 40, "Envoyer"));
		liste.add(new Cercle(200, 200, 40));
		liste.add(new Cercle(260, 200, 50));
		JFrame fen=new JFrame();
		fen.setTitle(titre);
		fen.setSize(500, 500);
		fen.setVisible(true);
		fen.add(this);
		
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("dessin");
		ListIterator<ObjetGraphique> it=liste.listIterator();
		while(it.hasNext()) {
			ObjetGraphique obj=it.next();
			obj.tracer(g);
		}
		
	}

	public static void main(String[] args) {
		TestGraphiques test=new TestGraphiques("Dessin des objets graphique");
	}


}
