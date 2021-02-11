import java.util.StringTokenizer;

public class Exemple3ChaineToken {

	public static void main(String[] args) {
		System.out.println("Exemple 1");
		StringTokenizer ch=new StringTokenizer("Bonjour comment\t allez vous ?\n BTS");
		System.out.println(ch.countTokens());
		while(ch.hasMoreTokens()) { //on test s'il ya encore des token dans ch
			System.out.println(ch.nextToken());//il affiche le token en cours
		}
		System.out.println("Exemple 2");
		StringTokenizer ch2=new StringTokenizer("Nom/Prénom:Niveau-Age:adresse", ":/-");
		while(ch2.hasMoreTokens()) { 
			System.out.println(ch2.nextToken());
		}
		
	}

}
