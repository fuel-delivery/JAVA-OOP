import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class App2 {

	public static void main(String[] args) {
		Vector<Fruit> fruits=new Vector<>();
		fruits.add(new Pomme(50));
		fruits.add(new Pomme(60));
		fruits.add(new Orange(100));
		fruits.add(new Orange(110));
		/*Iterator<Fruit> it=fruits.iterator();
		while(it.hasNext()) {
			Fruit f=it.next();
			f.affichePoids();
		}*/
		ListIterator<Fruit> it=fruits.listIterator();
		while(it.hasNext()) {
			Fruit f=it.next();
			f.affichePoids();
		}
	}

}
