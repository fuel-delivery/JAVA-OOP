import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Entrer le premier nombre:");
		a=sc.nextInt();
		System.out.print("Entrer le deuxième nombre:");
		b=sc.nextInt();
		sc.close();
		if(a%b==0)
			System.out.println("Le premier nombre est un multiple du second");
		else
			System.out.println("Le premier nombre n'est pas un multiple du second");
		
	}

}
