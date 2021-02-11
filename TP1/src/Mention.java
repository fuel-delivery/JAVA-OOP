
public class Mention {

	public static void main(String[] args) {
		float note=Float.parseFloat(args[0]);
		if(note>=0 && note<=20) {
			if(note>=16)
				System.out.println("Très bien");
			else if(note>=14) {
				System.out.println("Bien");
			}
			else if(note>=12) {
				System.out.println("Asszez bien");
			}
			else if(note>=10) {
				System.out.println("Passable");
			}
			else {
				System.out.println("nom admis");
			}
		}else {
			System.out.println("Ce n'est pas une note");
		}
		
	}

}
