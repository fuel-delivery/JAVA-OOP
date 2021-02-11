import java.util.ArrayList;
import java.util.List;

public class App1 {

	public static void main(String[] args) {
		/*List L=new ArrayList<>();
		L.add(new String("Ali"));
		L.add(new Integer(20));
		L.add(new Pomme(50));
		L.add(new Orange(70));
		for(int i=0;i<L.size();i++)
			System.out.println(L.get(i).toString());*/
		List<Fruit> L=new ArrayList<>();
		L.add(new Pomme(50));
		L.add(new Orange(80));
		L.add(new Orange(100));
		L.add(new Pomme(60));
		
		for(Fruit f:L)
			f.affichePoids();
		Fruit f1=L.remove(1);
		System.out.println("le fruit supprimé est:");
		f1.affichePoids();
		Fruit f2=new Orange(70);
		L.add(f2);
		L.add(f2);
		boolean supp=L.remove(f2);
		System.out.println(supp);
		supp=L.remove(f2);
		System.out.println(supp);
		//L.clear();
		List<Fruit> L2=new ArrayList<>();
		L2.add(new Pomme(40));
		L2.add(new Pomme(120));
		L.addAll(L2);
		L.removeAll(L2);
		System.out.println("après la suppression");
		for(int i=0;i<L.size();i++)
			L.get(i).affichePoids();
		Object T[]=L.toArray();
		System.out.println("Tableau des fruits:");
		for(int i=0;i<T.length;i++) {
			Fruit fr=(Fruit)T[i];
			fr.affichePoids();
		}
			
		/*List L3=new ArrayList<>();
		L3.add(new String("Bonjour"));
		L3.add(new Integer(50));
		Object T[]=L3.toArray();
		for(int i=0;i<T.length;i++)
			System.out.println(T[i]);*/
	}

}
