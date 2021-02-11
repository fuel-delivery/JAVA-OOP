
public class Test {

	public static void main(String[] args) {
		Personne p1=new Personne("Lallouch", (byte)19);
		System.out.println(p1);
		Personnel p2=new Personnel("El Bakkouri", (byte)19, "30 rue.. avenu les FAR Fès", 10000);
		System.out.println(p2.toString());
	}

}
