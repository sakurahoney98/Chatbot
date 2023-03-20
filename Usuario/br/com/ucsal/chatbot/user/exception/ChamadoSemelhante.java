package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class ChamadoSemelhante {
	
	public ChamadoSemelhante () {
		
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Opa! Parece que j� existe(m) chamado(s) semelhante(s) a esse que voc� est� tentand abrir:");
		mensagens.add("Parece que tem mais algu�m que reclamou da mesma coisa:");
		mensagens.add("Eu acho que tem algum(ns) chamado(s) aberto(s) sobre isso:");
		mensagens.add("Olha s� o que eu achei no meu banco de dados:");
		mensagens.add("O chamado que voc� est� tenatando abrir � referente a algum(ns) desse(s)?");
		
		//Selecionando aleatoriamente uma mensagem, atrav�s da posi��o no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		System.out.println("\n[@chatbot]: " + mensagens.get(sorteio));
		
				
	}

}
