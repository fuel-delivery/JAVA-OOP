
public class Test {

	public static void main(String[] args) {
		/*Ballon b1=new Ballon();
		Ballon b2=new Ballon("red");
		
		b1.afficheBallon("Le Ballon:");
		b2.afficheBallon();
		System.out.println("Le nombre total est:"+Ballon.getIdentMax());
*/
		Ballon b=new Ballon();
		for(int i=0;i<600000;i++) {
			b=new Ballon(""+i);
			
		}
		System.out.println("Le nombre total est:"+b.getIdentMax());
		
		
		
	}

}
