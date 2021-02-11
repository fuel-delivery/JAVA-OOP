
public class Exemple2ChaineModifiable {

	public static void main(String[] args) {
		StringBuffer ch=new StringBuffer("Bonjour");
		System.out.println(ch);
		System.out.println("taille de ch:"+ch.length());
		ch.append(" BTS");
		System.out.println(ch);
		System.out.println("taille de ch:"+ch.length());
		ch.setCharAt(0, 'b');
		System.out.println(ch);
		ch.insert(8, "DSI2 ");
		System.out.println(ch);
		String S=ch.toString();
		System.out.println(S);
		
	}

}
