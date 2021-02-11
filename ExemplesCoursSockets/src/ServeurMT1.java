import java.io.IOException;
import java.net.ServerSocket;

public class ServeurMT1 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(2021);
			Thread t=new Thread(new AccepterClient(ss));
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
