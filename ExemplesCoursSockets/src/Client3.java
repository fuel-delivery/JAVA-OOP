import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client3 {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost", 2021);
			OutputStream os=s.getOutputStream();
			PrintWriter pw=new PrintWriter(os, true);
			Scanner sc=new Scanner(System.in);
			String entree=sc.nextLine();
			pw.println(entree);
			//pw.flush();
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String rep=br.readLine();
			System.out.println(rep);
			sc.close();
			pw.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
