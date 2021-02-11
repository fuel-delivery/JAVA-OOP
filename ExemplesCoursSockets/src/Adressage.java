import java.net.InetAddress;
import java.net.UnknownHostException;

public class Adressage {

	public static void main(String[] args) {
		InetAddress adresseLocale, adresseServer;
		try {
			adresseLocale=InetAddress.getLocalHost();
			System.out.println("L'adresse locale de la machine:"+adresseLocale);
			adresseServer=InetAddress.getByName("www.google.com");
			InetAddress adresses[]=InetAddress.getAllByName("www.yahoo.com");
			System.out.println("L'adresse serveur:"+adresseServer);
			for(InetAddress adr:adresses) {
				System.out.println(adr);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
