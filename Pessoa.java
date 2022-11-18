package ArrayList;


import java.sql.Date;

public class Pessoa {
	
	private String nome;
	
	private String email;
	private Date nascimento;

	
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		Date date = Date.valueOf(nascimento);
		this.nascimento = date;
	}
	
	public String getNome() {
		return nome;
	}
	
	

	public void setNome(String nome) {
		if (nome.length()>3) {
			this.nome = nome;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa(String nome, String email, String nascimento) {
		setNome(nome);
		this.email = email;
		setNascimento(nascimento);
	}
	
	public Pessoa() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", nascimento=");
		builder.append(nascimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}