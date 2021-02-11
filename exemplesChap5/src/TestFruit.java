
public class TestFruit {

	public static void main(String[] args) {
		Fruit tab[]=new Fruit[3];
		tab[0]=new Pomme(60);
		tab[1]=new Orange(100);
		tab[2]=new Pomme(80);
		for(int i=0;i<tab.length;i++) {
			tab[i].affiche();
//			if(tab[i] instanceof Pomme)
//				((Pomme)tab[i]).affichePoids();
//			else if(tab[i] instanceof Orange)
//				((Orange)tab[i]).affichePoids();
			tab[i].affichePoids();
		}
	}

}
