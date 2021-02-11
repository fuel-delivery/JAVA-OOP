import java.util.StringTokenizer;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	public Date() {
		this.jour=1;
		this.mois=1;
		this.annee=1900;
	}
	public Date(int j, int m, int a) {
		this.jour=j;
		this.mois=m;
		this.annee=a;
	}
	private int conevrsionMoisToInt(String m) {
		m=m.toLowerCase();
		int numMois=0;
		switch(m) {
		case "janvier":
			numMois=1;
			break;
		case "février":
			numMois=2;
			break;
		case "mars":
			numMois=3;
			break;
		case "avril":
			numMois=4;
			break;
		case "mai":
			numMois=5;
			break;
		case "juin":
			numMois=6;
			break;
		case "juillet":
			numMois=7;
			break;
		case "aout":
			numMois=8;
			break;
		case "septembre":
			numMois=9;
			break;
		case "octobre":
			numMois=10;
			break;
		case "novembre":
			numMois=11;
			break;
		case "decembre":
			numMois=12;
			break;
		default:
			numMois=0;
		}
		return numMois;
	}
	public Date(String date) {
		StringTokenizer d=new StringTokenizer(date, ":/.- ");
		jour=Integer.parseInt(d.nextToken());
		String m=d.nextToken();
		if(m.length()<=2)
			mois=Integer.parseInt(m);
		else {
			int mcov=conevrsionMoisToInt(m);
			mois=mcov;
		}
		annee=Integer.parseInt(d.nextToken());
	}
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getAnnee() {
		return annee;
	}
	@Override
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}

}
