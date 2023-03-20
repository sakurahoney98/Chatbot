package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class CampoContemLetra extends Exception {
	
	
	public static String CampoContemLetra() {
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Parece que voc� digitou uma letrinha em um campo somente de n�meros.");
		mensagens.add("Vamo com calma amig�o, letra n�o pode nesse campo.");
		mensagens.add("Letras n�o passar�o.");
		mensagens.add("Nada de digitar letras nese campo, colega.");
		mensagens.add("Letras n�o s�o permitidas aqui.");
		
		//Selecionando aleatoriamente uma mensagem, atrav�s da posi��o no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		return mensagens.get(sorteio);
	}
	
	

}
