import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commande","root","");
			Statement st=con.createStatement();
			Scanner clavier=new Scanner(System.in);
			System.out.println("Entrer un mot clé:");
			String motcle=clavier.next();
			System.out.println("Entrer le prix maximal:");
			double p=clavier.nextDouble();
			clavier.close();
			String req="select * from produit where libelle like '%"+motcle+"%' and prix<"+p;
			ResultSet rs=st.executeQuery(req);
			ResultSetMetaData rsmd=rs.getMetaData();
			int ncol=rsmd.getColumnCount();
			for(int i=1;i<=ncol;i++)
				System.out.print(rsmd.getColumnLabel(i)+" ");
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=ncol;i++)
					System.out.print(rs.getString(i)+"\t");
				System.out.println();
			}
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
