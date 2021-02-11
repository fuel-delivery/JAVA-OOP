import java.util.Scanner;
public class Cercle {
	public static void main(String[] args) {
		double r;
		double d,p,s;
		final double pi=3.14;
		Scanner saisir =new Scanner(System.in);
		System.out.println("entrer la valeur dr rayon :");
		r= saisir.nextDouble();
		saisir.close();
		System.out.println("La valeur de PI:"+Math.PI);
		d=2*r;
		/*p=2*pi*r;
		s=pi*r*r;*/
		p=2*Math.PI*r;
		s=Math.PI*Math.pow(r,2);
		System.out.println("le diamètre de ce cercle est :"+d);

		System.out.println("le circonférence de ce crecle est:"+p);

		System.out.println("la surface de ce cercle est  :"+s);

		
		
	}
}
