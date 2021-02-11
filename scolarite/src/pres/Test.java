package pres;

import java.util.ArrayList;
import java.util.Scanner;

import metier.Etudiant;
import metier.Scolarite;

public class Test {

	public static void main(String[] args) {
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrer un mot clé:");
		String mot=clavier.next();
		clavier.close();
		Scolarite scol=new Scolarite();
		ArrayList<Etudiant> liste=scol.getEtudiant(mot);
		for(Etudiant E:liste)
			System.out.println(E.getId()+" "+E.getNom()+" "+E.getPrenom()+
					" "+E.getEmail()+" "+E.getVille());
	}

}
