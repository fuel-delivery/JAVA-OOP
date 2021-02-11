
public class TestPersonnel {

	public static void main(String[] args) {
		/*Personne TP[]=new Personne[3];
		TP[0]=new Personne("Alaoui", (byte)35);
		TP[1]=new Personnel("Rafiq", (byte)25, "Rue 23 hay Amal Fès",5500);
		TP[2]=new Enseignant("Slimani", (byte)40, "Avenue les FAR Fès",7500,"Informatique");
		*/
		/*
		Personne TP[]= {
				new Personne("Alaoui", (byte)35),
				new Personnel("Rafiq", (byte)25, "Rue 23 hay Amal Fès",5500),
				new Enseignant("Slimani", (byte)40, "Avenue les FAR Fès",7500,"Informatique")
		}*/
		/*
		Personne TP[]=new Personne[3];
		Personne p1=new Personne("Alaoui", (byte)35);
		Personnel p2=new Personnel("Rafiq", (byte)25, "Rue 23 hay Amal Fès",5500);
		Enseignant p3=new Enseignant("Slimani", (byte)40, "Avenue les FAR Fès",7500,"Informatique");
		TP[0]=p1;TP[1]=p2;TP[2]=p3;
		*/
		Personne p1=new Personne("Alaoui", (byte)35);
		Personnel p2=new Personnel("Rafiq", (byte)25, "Rue 23 hay Amal Fès",5500);
		Enseignant p3=new Enseignant("Slimani", (byte)40, "Avenue les FAR Fès",7500,"Informatique");
		Personne TP[]= {p1, p2, p3};
		for(int i=0;i<TP.length;i++) {
			System.out.println(TP[i].toString());
		}
	}

}
