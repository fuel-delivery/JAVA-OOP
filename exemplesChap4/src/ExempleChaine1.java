
public class ExempleChaine1 {

	public static void main(String[] args) {
		/*System.out.println("Voici la liste des arguments");
		for(int i=0; i < args.length; i++)
			System.out.println("Argument "+String.valueOf(i+1)+
					" de longueur "+args[i].length()+" : " + args[i]);*/
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double s=a+b;
		System.out.println("La somme de "+a+" et "+b+" est:"+s);

	}

}
