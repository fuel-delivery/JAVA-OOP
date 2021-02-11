package MesUtilitaires;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LireClavier{
	public static String litChaine(String message){
		String ligneEntree="";
		System.out.print(message + " ");
		try{
			InputStream in=System.in; // lecture au clavier d'un octet
			InputStreamReader isr=new InputStreamReader(in);// lecture d'un caractère formé par les octets
			BufferedReader fluxEntree = new BufferedReader(isr); // lecture d'une chaîne de caractères
			ligneEntree = fluxEntree.readLine();
			if(ligneEntree.length()==0) 
				return null;
		}
		catch (IOException e){
			System.out.println("IOException "+e);
		}
		return ligneEntree;
	}
	public static float litFloat(String message){
		String ligneEntree="";
		float res=0;
		System.out.print(message + " ");
		try{
			InputStream in=System.in; // lecture au clavier d'un octet
			InputStreamReader isr=new InputStreamReader(in);// lecture d'un caractère formé par les octets
			BufferedReader fluxEntree = new BufferedReader(isr); // lecture d'une chaîne de caractères
			ligneEntree = fluxEntree.readLine();
			res=Float.parseFloat(ligneEntree);
			if(ligneEntree.length()==0) 
				return 0;
		}
		catch (IOException e){
			System.out.println("IOException "+e);
		}
		return res;
	}
}