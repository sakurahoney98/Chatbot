package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class CampoObrigatorioVazio extends Exception {
	
	
	public static String CampoObrigatorioVazio() {
		
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Esse campo não pode ficar vazio não brother.");
		mensagens.add("Acho que você esqueceu alguma coisa... Preencha todos os campos obrigatorios.");
		mensagens.add("Opa, parece que você deixou esse campo obrigatório vazio.");
		mensagens.add("Preenche esse campo obrigatório para mim?");
		mensagens.add("Esse campo é obrigatório rs.");
		
		//Selecionando aleatoriamente uma mensagem, através da posição no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		return mensagens.get(sorteio);
	}
	
	

}
