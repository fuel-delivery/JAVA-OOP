import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class App3 {

	public static void main(String[] args) {
		Set<Fruit> ens1=new HashSet<>();
		Fruit f1=new Pomme(60);
		Fruit f2=new Orange(110);
		Fruit f3=new Pomme(70);
		Fruit f4=new Pomme(40);
		Fruit f5=new Orange(120);
		ens1.add(f1);
		ens1.add(f2);
		ens1.add(f3);
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
			System.out.println("existe déjà");
		else
			System.out.println("le fruit est bien ajouté");
	}

}
