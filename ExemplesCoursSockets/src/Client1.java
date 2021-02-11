import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost", 2021);
			System.out.println("connexion au serveur");
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
