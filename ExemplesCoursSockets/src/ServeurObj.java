import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurObj {

	public static void main(String[] args)throws IOException {
		ServerSocket ss=new ServerSocket(2021);
		System.out.println("serveur démarrer");
		Socket soc=ss.accept();
		System.out.println("un client est connecté");
		OutputStream os=soc.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		Produit p=new Produit();
		p.setNum(10);p.setLibelle("Ordinateur");p.setPrix(5000);
		oos.writeObject(p);
		System.out.println("le produit est envoyé au client");
		oos.close();
		soc.close();
		ss.close();
		
		
	}

}
