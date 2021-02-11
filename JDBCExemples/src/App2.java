import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {

	public static void main(String[] args) {
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:ucanaccess://C://Users//PC//Documents/gestion.accdb","","");
			Statement st=con.createStatement();
			String req="select * from client";
			ResultSet rs=st.executeQuery(req);
			ResultSetMetaData rsmd=rs.getMetaData();
			int ncol=rsmd.getColumnCount();
			for(int i=0;i<ncol;i++)
				System.out.print(rsmd.getColumnLabel(i+1)+" ");
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=ncol;i++)
					System.out.print(rs.getString(i)+"\t");
				System.out.println();
				//System.out.println(rs.getString("refpro")+" "+rs.getString("prix")+" "+rs.getString("libelle"));
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
