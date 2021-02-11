
public class NombrePremier {

	public static void main(String[] args) {
		boolean premier=true;
		for(int i=2;i<=100;i++) {
			premier=true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					premier=false;
			}
			if(premier==true)
				System.out.print(i+" ");

		}
		
	}

}
