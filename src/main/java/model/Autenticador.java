package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Autenticador {
	public String autenticar(String login, String senha) throws Exception {
		ConexaoDAO conn = new ConexaoDAO();
		try(Connection c = conn.conexaoDB()){
			PreparedStatement ps = c.prepareStatement("select nome from usuario where login = ? and senha = ?");
			ps.setString(1, login);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString("nome");
			} else {
				throw new Exception("Não foi possível autenticar o usuário!");
			}
		}
	}
}