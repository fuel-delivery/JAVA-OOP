import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur2 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(2021);
			System.out.println("Serveur attend des clients");
			Socket so=ss.accept();
			System.out.println("Client s'est connécté!");
			InputStream in=so.getInputStream();
			int res=in.read();
			System.out.println("J'ai reçu:"+res);
			int rep=res*3;
			OutputStream out=so.getOutputStream();
			out.write(rep);
			so.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
