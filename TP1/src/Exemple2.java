import java.util.Vector;

public class Exemple2 {

	public static void main(String[] args) {
		//int T1[];
		//T1=new int[10];
//		T1[0]=12;
//		T1[1]=15;
		int T1[]= {12,13,-5,-7,5,6,34,67};
		/*System.out.println("T1[0]:"+T1[0]);
		System.out.println("T1[1]:"+T1[1]);
		System.out.println("T1[2]:"+T1[2]);
		System.out.println("T1[3]:"+T1[3]);*/
		for(int i=0;i<T1.length;i++)
			System.out.println("T1["+i+"]:"+T1[i]);
		
		
		
		Vector T2[];
		T2=new Vector[3];
		T2[0]=new Vector();
		T2[0].add("Bonjour");
		T2[0].add(new Integer(20));
		T2[0].add(new Boolean(true));
		T2[1]=new Vector();
		T2[1].add("DSI2");
		T2[2]=new Vector();
		T2[2].add(new Float(25.34));
		T2[2].add(new String("BTS"));
		for(int i=0; i<T2.length;i++)
			System.out.println(T2[i]);
		
	}
	

}
