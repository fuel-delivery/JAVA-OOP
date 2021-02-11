import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur1 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(2021);
			System.out.println("Serveur attend des clients");
			Socket so=ss.accept();
			System.out.println("Client s'est connécté!");
			so.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
