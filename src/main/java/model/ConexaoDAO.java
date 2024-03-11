package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDAO {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Autenticador.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public Connection conexaoDB() {
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/coursera", "root", "root");
		} catch (SQLException e) {
			
		}
		
		return conn;
	}
}
