package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
	Connection conn;
	PreparedStatement pstm;
	
	public boolean validarUsuario(Usuario usuario) {
		boolean validadoNovoCadastro = false;
		String sql = "select login, email from usuario where login = ? or email = ?";
		
		conn = new ConexaoDAO().conexaoDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, usuario.getLogin());
			pstm.setString(2, usuario.getEmail());

			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				validadoNovoCadastro = false;
			} else {
				validadoNovoCadastro = true;
			}
			
			pstm.close();
		} catch(SQLException e) {
			
		}
		
		return validadoNovoCadastro;
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		String sql = "insert into usuario (login, email, nome, senha, pontos) "
				+ "values (?,?,?,?,?)";
		conn = new ConexaoDAO().conexaoDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, usuario.getLogin());
			pstm.setString(2, usuario.getEmail());
			pstm.setString(3, usuario.getNome());
			pstm.setString(4, usuario.getSenha());
			pstm.setInt(5, usuario.getPontos());
			
			pstm.execute();
			pstm.close();
		} catch(SQLException e) {
			
		}
	}
}
