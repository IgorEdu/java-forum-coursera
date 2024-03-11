package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Autenticador;
import model.UsuarioDAO;

import java.io.IOException;


@WebServlet("/cadastrar")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String nome = request.getParameter("nome");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		
		
		try {
			
		} catch(Exception ex) {
			request.setAttribute("erro", ex.getMessage());
		}
	}

}
