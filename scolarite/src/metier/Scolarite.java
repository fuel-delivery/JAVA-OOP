package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Scolarite {
	public ArrayList<Etudiant> getEtudiant(String mc){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite", "root", "");
			String req="select * from etudiants where nom like ?";
			PreparedStatement ps=con.prepareStatement(req);
			ps.setString(1, "%"+mc+"%");
			ResultSet rs=ps.executeQuery();
			ArrayList<Etudiant> etuds=new ArrayList<>();
			while(rs.next()) {
				Etudiant E=new Etudiant();
				E.setId(rs.getInt(1));
				E.setNom(rs.getString(2));
				E.setPrenom(rs.getString(3));
				E.setEmail(rs.getString(4));
				E.setVille(rs.getString(5));
				etuds.add(E);
			}
			return etuds;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
