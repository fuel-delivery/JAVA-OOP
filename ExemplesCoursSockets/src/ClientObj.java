import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientObj {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost", 2021);
			InputStream is=s.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			Object obj=ois.readObject();
			Produit prod=(Produit)obj;
			System.out.println("Produit:"+prod.getNum()+" "+prod.getLibelle()+" "+prod.getPrix());
			System.out.println("reçu depuis le serveur");
			ois.close();
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
