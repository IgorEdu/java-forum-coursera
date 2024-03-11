package model;

public class Usuario {
	private String nome;
	private String login;
	private String email;
	private String senha;
	private int pontos;
	
	public Usuario(String nome, String login, String email, String senha, int pontos) {
		super();
		this.nome = nome;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
}
