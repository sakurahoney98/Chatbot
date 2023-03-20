package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class CampoObrigatorioVazio extends Exception {
	
	
	public static String CampoObrigatorioVazio() {
		
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Esse campo n�o pode ficar vazio n�o brother.");
		mensagens.add("Acho que voc� esqueceu alguma coisa... Preencha todos os campos obrigatorios.");
		mensagens.add("Opa, parece que voc� deixou esse campo obrigat�rio vazio.");
		mensagens.add("Preenche esse campo obrigat�rio para mim?");
		mensagens.add("Esse campo � obrigat�rio rs.");
		
		//Selecionando aleatoriamente uma mensagem, atrav�s da posi��o no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		return mensagens.get(sorteio);
	}
	
	

}
