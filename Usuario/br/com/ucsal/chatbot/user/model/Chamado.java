package br.com.ucsal.chatbot.user.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Chamado {
	
	private int cod_chamado;
	private String assunto;
	private String descricao;
	private int cont_apoio;
	private ArrayList<String> atualizacao;
	private String status;
	private String responsavel;
	private String sala;
	private String equipamento;
	private String hora;
	private String data;
	
	
	
	
	
	public String getHora_abertura() {
		return hora;
	}


	public void setHora_abertura(String hora) {
		this.hora = hora;
	}


	public String getData_abertura() {
		return data;
	}


	public void setData_abertura(String data) {
		this.data = data;
	}


	public int getCod_chamado() {
		return cod_chamado;
	}
	public void setCod_chamado(int cod_chamado) {
		this.cod_chamado = cod_chamado;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCont_apoio() {
		return cont_apoio;
	}
	public void setCont_apoio(int cont_apoio) {
		this.cont_apoio = cont_apoio;
	}
	public ArrayList<String> getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(ArrayList<String> atualizacao) {
		this.atualizacao = atualizacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	
	
	

}
