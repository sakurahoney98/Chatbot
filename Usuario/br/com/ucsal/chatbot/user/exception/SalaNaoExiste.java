package br.com.ucsal.chatbot.user.exception;

import java.util.ArrayList;
import java.util.Random;

public class SalaNaoExiste extends Exception{
	
	public String SalaNaoExisteInterface() {
		
		//Criando array de mensagens personalizadas de erro
		ArrayList<String> mensagens = new ArrayList<String>();
		
		//Adicionando mensagens personalizadas de erro
		mensagens.add("Camarada, acho que essa sala não existe não hein?!");
		mensagens.add("Cê tem certeza que existe essa sala na faculdade?");
		mensagens.add("Hum... Acho que você digitou alguma coisa errada porque eu não achei nenhuma sala.");
		mensagens.add("Confere para mim o número do sala e tenta novamente, beleza?");
		mensagens.add("Nunca vi essa sala na minha vida.");
		
		//Selecionando aleatoriamente uma mensagem, através da posição no array
		Random gerador = new Random();
		int sorteio = gerador.nextInt(mensagens.size());
		
		return mensagens.get(sorteio);
		
	}

}
