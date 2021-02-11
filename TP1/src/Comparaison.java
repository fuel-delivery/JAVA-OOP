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
			System.out.println(a+" est supérieur à "+b);
		else if(a<b)
			System.out.println(a+" est inférieur à "+b);
		else
			System.out.println(a+" est égale à "+b);
	}

}
