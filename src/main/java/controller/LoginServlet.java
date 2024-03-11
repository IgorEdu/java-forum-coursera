package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Autenticador;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Autenticador autenticador = new Autenticador();
		
		try {
			String nomeUsuario = autenticador.autenticar(login, senha);
			request.setAttribute("nome", nomeUsuario);
			request.getRequestDispatcher("topicos.jsp").forward(request, response);
		} catch(Exception ex) {
			request.setAttribute("erro", ex.getMessage());
		}
	}

}
