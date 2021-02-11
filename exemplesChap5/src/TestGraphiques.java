import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGraphiques extends JPanel{
	private ObjetGraphique T[];
	public TestGraphiques(String titre) {
		T=new ObjetGraphique[6];
		T[0]=new Rectangle(50, 50, 100, 60);
		T[1]=new Rectangle(170, 50, 100, 60);
		T[2]=new Bouton(50, 140, 80, 40, "OK");
		T[3]=new Bouton(150, 140, 80, 40, "Envoyer");
		T[4]=new Cercle(200, 200, 40);
		T[5]=new Cercle(260, 200, 50);
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
		for (int i = 0; i < T.length; i++) {
			T[i].tracer(g);
		}
		
	}

	public static void main(String[] args) {
		TestGraphiques test=new TestGraphiques("Dessin des objets graphique");
	}

}
