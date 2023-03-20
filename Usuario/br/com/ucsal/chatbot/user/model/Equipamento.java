package br.com.ucsal.chatbot.user.model;

public class Equipamento {
	private String nome;
	private int codigo;
	
	
	public Equipamento(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	

}
