import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost", 2021);
			System.out.println("connexion au serveur");
			OutputStream out=s.getOutputStream();
			out.write(100);
			InputStream in=s.getInputStream();
			int r=in.read();
			System.out.println("Résultat reçu:"+r);
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
