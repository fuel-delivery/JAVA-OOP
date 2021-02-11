import java.util.Scanner;
public class Operation {
	

	public static void main(String[] args) {
		int somme , soustraction, produit , quotion;
		int a,b;
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer a:");
		a= clavier.nextInt();
		System.out.println("Entrer b:");
		b= clavier.nextInt();
		clavier.close();
		//calcule de somme
		somme=a+b;
		System.out.println("la résultat de somme est :"+somme);
		//calcule de soustraction
		soustraction=a-b;
		System.out.println("la résultat de soustraction est :"+soustraction);
		//calcule de produit
		produit=a*b;
		System.out.println("la résultat de produit est :"+produit);
		//calcule de qoution
		if (b!=0) {
			quotion=a/b;
			System.out.println("la résultat de quotion est :"+quotion);
		}
		else {
			System.out.println("impossible de diviser par 0");
		}
		
	}

}
