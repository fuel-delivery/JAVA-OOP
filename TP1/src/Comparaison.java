import java.util.Scanner;

public class Comparaison {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer deux entiers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		if(a>b)
			System.out.println(a+" est sup�rieur � "+b);
		else if(a<b)
			System.out.println(a+" est inf�rieur � "+b);
		else
			System.out.println(a+" est �gale � "+b);
	}

}
