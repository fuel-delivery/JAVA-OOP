import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commande","root","");
			String req="select * from produit where libelle like ? and prix<?";
			PreparedStatement ps=con.prepareStatement(req);
			Scanner clavier=new Scanner(System.in);
			System.out.println("Entrer un mot clé:");
			String motcle=clavier.next();
			System.out.println("Entrer le prix maximal:");
			double p=clavier.nextDouble();
			clavier.close();
			ps.setString(1, "%"+motcle+"%");
			ps.setDouble(2, p);
			ResultSet rs=ps.executeQuery();
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
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
