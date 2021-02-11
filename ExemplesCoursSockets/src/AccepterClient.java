import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AccepterClient implements Runnable{
	private ServerSocket ss;
	private Socket soc;
	private int nbrClient=1;
	public AccepterClient(ServerSocket ss) {
		this.ss=ss;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				soc=ss.accept();
				System.out.println("un client "+nbrClient+" est connecté");
				nbrClient++;
				soc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
