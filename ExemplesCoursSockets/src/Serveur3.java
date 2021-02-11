import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur3 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(2021);
			System.out.println("J'attends des connexions");
			Socket soc=ss.accept();
			InputStream is=soc.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String msg=br.readLine();
			System.out.println("Message reçu depuis le client:"+msg);
			System.out.println("adresse du client:"+soc.getInetAddress().getHostAddress());
			System.out.println("port du client:"+soc.getPort());
			PrintWriter pw=new PrintWriter(soc.getOutputStream(), true);
			pw.println("Merci client!!");
			//pw.flush();
			pw.close();
			soc.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
