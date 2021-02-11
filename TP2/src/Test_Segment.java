

import point.Cpoint3D;

public class Test_Segment {

	public static void main(String[] args) {
		System.out.println("Premier segment");
		Segment s1 = new Segment(2.5,4,3,13,5.6,2);
		s1.afficher();
		System.out.println("Deuxième segment");
		Cpoint3D o=new Cpoint3D(1, 2, 3);
		Cpoint3D e=new Cpoint3D(3, 5, 7);
		Segment s2=new Segment(o, e);
		s2.afficher();
	}

}
