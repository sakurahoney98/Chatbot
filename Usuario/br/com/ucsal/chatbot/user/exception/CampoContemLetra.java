package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class CampoContemLetra extends Exception {
	
	
	public static String CampoContemLetra() {
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Parece que você digitou uma letrinha em um campo somente de números.");
		mensagens.add("Vamo com calma amigão, letra não pode nesse campo.");
		mensagens.add("Letras não passarão.");
		mensagens.add("Nada de digitar letras nese campo, colega.");
		mensagens.add("Letras não são permitidas aqui.");
		
		//Selecionando aleatoriamente uma mensagem, através da posição no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		return mensagens.get(sorteio);
	}
	
	

}
