import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {

	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commande","root","");
			Statement st=con.createStatement();
			String req="select * from produit";
			ResultSet rs=st.executeQuery(req);
			ResultSetMetaData rsmd=rs.getMetaData();
			int ncol=rsmd.getColumnCount();
			for(int i=0;i<ncol;i++)
				System.out.print(rsmd.getColumnLabel(i+1)+" ");
			System.out.println();
			while(rs.next()) {
				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				for(int i=1;i<=ncol;i++)
					System.out.print(rs.getString(i)+"\t");
				System.out.println();
				//System.out.println(rs.getString("refpro")+" "+rs.getString("prix")+" "+rs.getString("libelle"));
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
