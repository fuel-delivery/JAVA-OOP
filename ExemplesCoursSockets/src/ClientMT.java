import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMT {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost", 2021);
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
