import java.util.Scanner;

public class OperationV2 {
	private static int somme(int a, int b) {
		return a+b;
	}
	private static int soustraction(int a, int b) {
		return a-b;
	}
	private static int multiplication(int a, int b) {
		return a*b;
	}
	private static void division(int a, int b) {
		if(b!=0)
			System.out.println("La division est:"+a/b);
		else
			System.out.println("Impossible de diviser par zéro");
	}

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Entrer deux entiers:");
		x=sc.nextInt();
		y=sc.nextInt();
		sc.close();
		System.out.println("La somme est:"+somme(x,y));
		System.out.println("La soustraction est:"+soustraction(x,y));
		System.out.println("La multiplication est:"+multiplication(x,y));
		division(x, y);
		
		
	}

}
