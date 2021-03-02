import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class App3 {

	public static void main(String[] args) {
		HashSet<Fruit> ens1=new HashSet<>();
		Fruit f1=new Pomme(60);
		Fruit f2=new Orange(110);
		Fruit f3=new Pomme(70);
		Fruit f4=new Pomme(40);
		Fruit f6=new Pomme(40);
		Fruit f5=f3; // meme adresse
		ens1.add(f1);
		ens1.add(f2);
		ens1.add(f5);
		ens1.add(f3);
		ens1.add(f6);
		ens1.Lenght();
		for (Fruit fr : ens1) {
			System.out.println(fr);
		}
		List<Fruit> L=new ArrayList<>();
		L.add(f1);L.add(f4);L.add(f5);
		ens1.addAll(L);
		Iterator<Fruit> it=ens1.iterator();
		while(it.hasNext()) {
			Fruit f=it.next();
			f.affichePoids();
		}
		boolean existe=ens1.add(f5);
		if(!existe)
			System.out.println("existe d�j�");
		else
			System.out.println("le fruit est bien ajout�");
	}

	HashMap<Personne, String> personnes = new HashMap<String, String>();

    // Add keys and values (Country, City)
    personnes.put("England", "London");
    personnes.put("Germany", "Berlin");
    personnes.put("Norway", "Oslo");
    personnes.put("USA", "Washington DC");
    System.out.println(capitalCities);

}
