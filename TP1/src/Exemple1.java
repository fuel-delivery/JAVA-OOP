
public class Exemple1 {

	public static void main(String[] args) {
		int a=20;
		float x=24.75f;
		double y=12.75;
		boolean bool=false;
		System.out.println("La valeur de a:"+a);
		System.out.println("La valeur de x:"+x);
		System.out.println("La valeur de y:"+y);
		System.out.println("La valeur de bool:"+bool);
		StringBuffer s1;//déclaration de l'objet
		s1=new StringBuffer("Bonjour DSI2");
		StringBuffer s2=s1;
		//avant la modification
		System.out.println("avant la modification");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		//après la modification
		System.out.println("après la modification");
		s2.append(" est ce que tout va bien?");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		//autre modification
		System.out.println("autre modification");
		s1.append(" oui ça marche bien!!");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		// s1=null
		System.out.println("s1 ne pointe pas sur l'espace de s2");
		s1=null;
		System.out.println("s1:"+s1);
		System.out.println("S2:"+s2);
		StringBuffer sh1=new StringBuffer("Bonjour");
		StringBuffer sh2=new StringBuffer(sh1);
		System.out.println("sh1:"+sh1);
		System.out.println("sh2:"+sh2);
		sh1.append(" BTS");
		System.out.println("sh1:"+sh1);
		System.out.println("sh2:"+sh2);
				
	}

}
